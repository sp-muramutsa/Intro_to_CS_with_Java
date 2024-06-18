/*
 * Practice using switch statement by translating Decimal Numerals to Roman 
 * Sandrin Pacifique Muramutsa
 * 02/22/2024
 */

import java.util.*;

public class RomanNumeralTranslator 
{
    public static void main(String[] args) 
    {
       
        String prompt= "\nPlease enter any integer in the range of 1 to 999\n";
        prompt +="If you want to enter 245, simply type in 245 and hit enter\n";
        prompt += "\n -->  ";
        System.out.print(prompt);
        
        Scanner keyboard = new Scanner(System.in);
             
        int  number = keyboard.nextInt();
        if (number < 1 || number > 999) 
        {
            String errorMessage = "Invalid input! Please enter an integer";
            errorMessage += "in the range of 1 to 999. \n";
            System.out.println(errorMessage);
            System.exit(0);
        }           

        int unitsDigit = number % 10;
        int tensDigit = (number / 10) % 10;
        int hundredsDigit = number / 100;

        String isolatedDigits = "The isolated digits are: "+hundredsDigit+" ";
        isolatedDigits += tensDigit+" "+unitsDigit+"\n";
        System.out.println(isolatedDigits);

        String romanNumeral = "";

        switch (hundredsDigit) 
        {
            case 1:
                romanNumeral += "C";
                break;
            case 2:
                romanNumeral += "CC";
                break;
            case 3:
                romanNumeral += "CCC";
                break;
            case 4:
                romanNumeral += "CD";
                break;
            case 5:
                romanNumeral += "D";
                break;
            case 6:
                romanNumeral += "DC";
                break;
            case 7:
                romanNumeral += "DCC";
                break;
            case 8:
                romanNumeral += "DCCC";
                break;
            case 9:
                romanNumeral += "CM";
                break;             
        }

        switch (tensDigit) 
        {
            case 1:
                romanNumeral += "X";
                break;
            case 2:
                romanNumeral += "XX";
                break;
            case 3:
                romanNumeral += "XXX";
                break;
            case 4:
                romanNumeral += "XL";
                break;
            case 5:
                romanNumeral += "L";
                break;
            case 6:
                romanNumeral += "LX";
                break;
            case 7:
                romanNumeral += "LXX";
                break;
            case 8:
                romanNumeral += "LXXX";
                break;
            case 9:
                romanNumeral += "XC";
                break;
        }

        switch (unitsDigit) 
        {
            case 1:
                romanNumeral += "I";
                break;
            case 2:
                romanNumeral += "II";
                break;
            case 3:
                romanNumeral += "III";
                break;
            case 4:
                romanNumeral += "IV";
                break;
            case 5:
                romanNumeral += "V";
                break;
            case 6:
                romanNumeral += "VI";
                break;
            case 7:
                romanNumeral += "VII";
                break;
            case 8:
                romanNumeral += "VIII";
                break;
            case 9:
                romanNumeral += "IX";
                break;
        }

        String translation = "The value of "+number+" in Roman numerals is: "; 
        translation += romanNumeral+"\n";
        System.out.println(translation);
    }
}

