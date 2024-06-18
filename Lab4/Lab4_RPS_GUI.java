/*
 * Lab 4 : Practicing working with GUI, switch statement, and the while loop.
 * Sandrin Pacifique Muramutsa
 * 03-14-2024
 */

import java.util.*;
import javax.swing.*;

public class Lab4_RPS_GUI 
{
    public static void main(String[] args) 
    {
  
        String startMessage = "Welcome to the Rock, Paper, Scissors game!\n\n"+
            "You will make your choice by clicking on one of the buttons.\n" +
            "The computer will randomly choose its option.\n" +
            " The winner of each round will be determined based on the "+
            "choices.\n The game will consist of three rounds.\n\n" +
            "Are you ready? Let's play!";
        
        ImageIcon welcomeIcon = new ImageIcon("RPS.png");
        JOptionPane.showMessageDialog(null, startMessage,
        "Opening \"Rock, Paper, Scissors\"             Sandrin M.",
        JOptionPane.INFORMATION_MESSAGE, welcomeIcon);

    
        int results[] = {0, 0, 0};
        int rounds = 3;
        int round = 0;
        while (round < rounds) 
        {
            ImageIcon optionsIcon = new ImageIcon("RPS2.png");
            String prompt = "Please, Click on one of\n" +
                            "the following buttons, \n" +
                            "corresponding to your play\n";

            String[] choices = {"Scissors", "Paper", "Rock"};

            int choice = JOptionPane.showOptionDialog(null, 
                    prompt,
                    "Play \"Rock, Paper, Scissors\"           Sandrin M. ",
                0, 0, optionsIcon, 
                   choices, choices[0]);

            String playerChoice = "";
            String computerChoice = "";

            switch (choice) 
            {
                case 0 -> playerChoice = "Scissors";
                case 1 -> playerChoice = "Paper";
                case 2 -> playerChoice = "Rock";
            }
            String resultsAccumulator = "You played \"" + playerChoice + "\"\n";

            int computerChoiceIndex = new Random().nextInt(3);
              switch (computerChoiceIndex) 
            {
                case 0 -> computerChoice = "Scissors"; 
                case 1 -> computerChoice = "Paper"; 
                case 2 -> computerChoice = "Rock"; 
            }

            String roundWinnerIConName;
            String displayWin = "The computer played \"" + computerChoice + 
                                "\". You win this round!";
            String displayLoss = "The computer played \"" + computerChoice +
                                "\". The computer wins this round!";
            String displayDraw = "The computer played \"" + computerChoice + 
                                 "\". This round is a draw!";
            
            if (computerChoice.equals(playerChoice)) 
            {
                resultsAccumulator += displayDraw;
                roundWinnerIConName = "RPS.png";
                results[2] += 1;
            } 
            
            else if (playerChoice.equals("Rock") && 
                    computerChoice.equals("Paper"))
            {
                resultsAccumulator += displayLoss + "\nPaper wraps Rock.\n";
                roundWinnerIConName = "paperWrapsRock.png";
                results[1] += 1;
            }
            
            else if (playerChoice.equals("Rock") && 
                    computerChoice.equals("Scissors"))
            {
                resultsAccumulator += displayWin + "\nRock crushes scissors.\n";
                roundWinnerIConName = "rockCrushScissor.png";
                results[0] += 1;
            }
            
            else if (playerChoice.equals("Paper") && 
                    computerChoice.equals("Rock"))
            {
                resultsAccumulator += displayWin + "\nPaper wraps Rock.\n";
                roundWinnerIConName = "paperWrapsRock.png";
                results[0] += 1;
            }
            
            else if (playerChoice.equals("Paper") && 
                    computerChoice.equals("Scissors"))
            {
                resultsAccumulator += displayLoss + "\nScissors cuts paper.\n";
                roundWinnerIConName = "scissorCutPaper.png";
                results[1] += 1;
            }
            
            else if (playerChoice.equals("Scissors") && 
                    computerChoice.equals("Rock"))
            {
                resultsAccumulator+= displayLoss + "\nRock crushes scissors.\n";
                roundWinnerIConName = "rockCrushScissor.png";
                results[1] += 1;
            }
            
            else 
            {
                resultsAccumulator += displayWin + "\nScissors cuts paper.\n";
                roundWinnerIConName = "scissorCutPaper.png";
                results[2] += 1;
            }
            
            ImageIcon roundWinnerIcon = new ImageIcon(roundWinnerIConName);
            JOptionPane.showMessageDialog(null, 
                    resultsAccumulator,
                    "End of round results           Sandrin M. ",
                    0, roundWinnerIcon);
            
            round++;
        }
        
        ImageIcon resultsIcon = new ImageIcon("RPS2.png");
        String displayResults = "Game Over!\nWins: " + results[0] + "\nLosses: " 
                                + results[1] + "\nDraws: " + results[2];
        JOptionPane.showMessageDialog(null, displayResults,
                "Final results           Sandrin M.",
            JOptionPane.INFORMATION_MESSAGE, resultsIcon);
        
        String endMessage = "Thank you for playing the Rock, Paper, " +
                            "Scissors game!\n Hope you enjoyed the game!";
        
        ImageIcon endIcon = new ImageIcon("RPS.png");
        JOptionPane.showMessageDialog(null, endMessage,
        "Exiting \"Rock, Paper, Scissors\"             Sandrin M.",
        JOptionPane.INFORMATION_MESSAGE, endIcon);


    }
}

