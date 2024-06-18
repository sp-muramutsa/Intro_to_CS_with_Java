
/**
 * Assignment 3: Practicing static functions, 2D arrays, and GUI applications
 * by making a Battle Ship Display Game
 * Sandrin Pacifique Muramutsa, Wilfred Robert-Fajimi
 * 04/19/2024
 */
import javax.swing.*;
import java.util.*;

public class BattleShipDisplay {

    public static void main(String[] args) {
        String welcomeMessage="Welcome to the Battle Ship Game!\nWhen you click"
                + " \"Display New Board\", A new battle ship will be displayed"
                + ".\nWhen you click \"Quit Game\", the game will exit.\n"
                + "Click \"OK\" to continue";
        
         JOptionPane.showMessageDialog(null, welcomeMessage,
                "Sandrin MP ~ WIlfred RF",
                JOptionPane.INFORMATION_MESSAGE);

        int rows = 0;
        int columns = 0;

        while (true) {
            String rowsInput = JOptionPane.showInputDialog(
                    null,
                    "Enter the number of rows. The number of rows should "
                    + "be in the range 5 to 40, inclusive.",
                    "5");
            rows = Integer.parseInt(rowsInput);

            String columnsInput = JOptionPane.showInputDialog(
                    null,
                    "Enter the number of columns. The number of columns"
                    + " should be in the range 5 to 40, inclusive.",
                    "5");
            columns = Integer.parseInt(columnsInput);

            if (rows < 5 || rows > 40 || columns < 5 || columns > 40) {
                String errorMessage = "Both rows and columns should be in the"
                        + "range 5 to 40, inclusive.";
                JOptionPane.showMessageDialog(
                        null,
                        errorMessage,
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);;
            } else {
                break;
            }
        }

        while (true) {

            Random random = new Random();

            String[][] board = generateBoard(rows, columns);
            int nextGameOption = displayBoard(board);

            if (nextGameOption == JOptionPane.NO_OPTION) {
                String exitMessage = "Program exiting! See you next time!";
                JOptionPane.showMessageDialog(
                        null,
                        exitMessage,
                        "Sandrin MP ~ WIlfred RF",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            }

        }
    }

    static String[][] generateBoard(int rows, int columns) {
        String[][] board = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                board[row][col] = " -- ";
            }
        }

        Random random = new Random();
        int orientation = random.nextInt(2);

        // Vertical 
        if (orientation == 0) {
            int fixedCol = random.nextInt(columns);
            int startRow = random.nextInt(rows - 4);

            for (int row = startRow; row < startRow + 5; row++) {
                board[row][fixedCol] = "  X  ";
            }

        } // Horizontal
        else {
            int fixedRow = random.nextInt(rows);
            int startCol = random.nextInt(columns - 4);

            for (int col = startCol; col < startCol + 5; col++) {
                board[fixedRow][col] = "  X  ";
            }

        }

        return board;

    }

    static int displayBoard(String[][] board) {
        String formattedBoard = "New Gameboard \n";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                formattedBoard += board[row][col];

            }
            formattedBoard += "\n";
        }

        String[] options = {"Display New Board", "Quit Game"};
        int option = JOptionPane.showOptionDialog(
                null,
                formattedBoard,
                "Sandrin MP ~ WIlfred RF",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]);

        return option;

    }

}
