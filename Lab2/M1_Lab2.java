/*
 * Practice working with SCANNER and RANDOM and Constants
 * Sandrin Pacifique Muramutsa
 * 02/01/2024
 */
import java.util.*;

public class M1_Lab2 
{
    
    public static void main(String[] args)
    {
        
        Scanner keyboardScanner = new Scanner(System.in);
        
        String prompt = "\nPlease enter the lower range as an integer.\n";
               prompt += "IF you want to enter 55, simply type in 55 and hit enter.\n";
               prompt += "\n --> ";
        System.out.print(prompt);
        int lowerRange = keyboardScanner.nextInt();
          
        prompt = "\nPlease enter the upper range as an integer less than the lower range.\n";
        prompt += "IF you want to enter 55, simply type in 55 and hit enter.\n";
        prompt += "\n --> ";
        System.out.print(prompt);
        int upperRange = keyboardScanner.nextInt();
       
        int range = (upperRange - lowerRange) + 1;
 
        Random randGen = new Random();
          
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range)));
        System.out.println("Random Number: " + (lowerRange + randGen.nextInt(range))+"\n\n");
        
    }
    
}

    

