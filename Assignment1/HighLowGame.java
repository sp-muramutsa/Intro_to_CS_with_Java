
/** Practicing decisions by Building a high-low game
 * Sandrin Pacifique Muramutsa
 * 02/09/2024
*/

import java.util.*;

public class HighLowGame {
    public static void main(String[] args) {
        String welcomeMessage = """
            Welcome to the High-Low Dice Game!
            \tIn this game, five dice will get rolled for you.
            \tAfter that, you will predict whether the total of your rolls
            \twill be higher or lower than the total of computer's rolls. 
            \tType "H" for higher or "L" for lower and click enter.                  
            """;
        
        System.out.println(welcomeMessage); 
        
        Random randGen = new Random();
        Scanner userRoll = new Scanner(System.in);
        
        int userFirstRoll = randGen.nextInt(6) + 1;
        int userSecondRoll = randGen.nextInt(6) + 1;
        int userThirdRoll = randGen.nextInt(6) + 1;
        int userFourthRoll = randGen.nextInt(6) + 1;
        int userFifthRoll = randGen.nextInt(6) + 1;
        
        int userTotalRolls = userFirstRoll + userSecondRoll + userThirdRoll;
        userTotalRolls +=  userFourthRoll + userFifthRoll; 
        
        System.out.println("\nYou rolled: ");
        System.out.println("Die 1 --> " + userFirstRoll);
        System.out.println("Die 2 --> " + userSecondRoll);
        System.out.println("Die 3 --> " + userThirdRoll);
        System.out.println("Die 4 --> " + userFourthRoll);
        System.out.println("Die 5 --> " + userFifthRoll);
        System.out.println("which totals to " + userTotalRolls);
        
        String higherLowerPrompt = "\nEnter 'H' if you think the total will be";
        higherLowerPrompt += " higher, \n\tor 'L' if you think it will be lower: ";
        System.out.print(higherLowerPrompt);
        
        String userPrediction = userRoll.next();
  
        int compFirstRoll = randGen.nextInt(6) + 1;
        int compSecondRoll = randGen.nextInt(6) + 1;
        int compThirdRoll = randGen.nextInt(6) + 1;
        int compFourthRoll = randGen.nextInt(6) + 1;
        int compFifthRoll = randGen.nextInt(6) + 1;
        
        int compTotalRolls = compFirstRoll + compSecondRoll;
        compTotalRolls += compThirdRoll + compFourthRoll; 
        compTotalRolls += compFifthRoll;
                
        System.out.println("\nThe computer rolled: ");
        System.out.println("Die 1 --> " + compFirstRoll);
        System.out.println("Die 2 --> " + compSecondRoll);
        System.out.println("Die 3 --> " + compThirdRoll);
        System.out.println("Die 4 --> " + compFourthRoll);
        System.out.println("Die 5 --> " + compFifthRoll);
        System.out.println("which totals to " + compTotalRolls + "\n");
        
        if (userPrediction.equals("H")) 
        {
            if (userTotalRolls > compTotalRolls) 
            {
                System.out.println("Congratulations! You called higher and you were correct!\n");
            }
            
            else if (userTotalRolls < compTotalRolls) {
                System.out.println("Sorry, you called higher but you were wrong!\n");
            }
            
            else 
            {
                System.out.println("It's a tie! Both you and the computer rolled " + userTotalRolls + "\n");
            }
        } 
        
        
        else if (userPrediction.equals("L")) 
        {
            if (userTotalRolls < compTotalRolls) 
            {
                System.out.println("Congratulations! You called lower and you were correct!\n");
            }
            
            else if (userTotalRolls > compTotalRolls) 
            {
                System.out.println("Sorry, you called lower but you were wrong!\n");
            } 
            
            else 
            {
                System.out.println("It's a tie! Both you and the computer rolled " + userTotalRolls + "\n");
            }
        } 
        
        System.out.println("This program is closing!\n");
    }   
}