
/**
 * Praciticing OOP by testing the Box class.
 * Sandrin Pacifique Muramutsa, Wilfred Robert-Fajimi
 * 04/26/2024
 */

import java.util.*;
import java.io.*;
import javax.swing.*;

public class shipDriver 
{

    public static void main(String[] args) 
    {
        ArrayList<Ship> myShips = new ArrayList<Ship>();

        String fileName = "justShips.csv";
        File inFile = new File(fileName);

        if (!inFile.exists()) 
        {
            String errorMessage = "The file " + fileName + " is not present.";
            JOptionPane.showMessageDialog(null, errorMessage, 
                    "File Missing", 2);
            System.exit(0);
        }

        try 
        {
            Scanner inScan = new Scanner(inFile).useDelimiter("[\n,]");

            while (inScan.hasNext()) 
            {
                String tempName = inScan.next();
                int tempYear = inScan.nextInt();
                String tempCountry = inScan.next();

                myShips.add(new Ship(tempName, tempYear, tempCountry));
            }

            inScan.close();

        } 
        
        catch (IOException ioe) 
        {
            String errorMessage = "Trouble opening file " + fileName;
            JOptionPane.showMessageDialog(null, errorMessage);
            System.exit(0);
        }

        String message = "There are "+myShips.size()+" ships in my list.";
        JOptionPane.showMessageDialog(null, message, 
                "Sandrin MP—Wilfred RF", 1);

        String shipDisplay = "Our fleet:\n";
        for (int ship = 1; ship <= myShips.size(); ship++) 
        {
            shipDisplay += ship+". "+myShips.get(ship-1).toString() + "\n";
        }

        JOptionPane.showMessageDialog(null, shipDisplay, 
                "Sandrin MP—Wilfred RF", 1);

    }
}
