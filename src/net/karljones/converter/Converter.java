package net.karljones.converter;

import java.util.Scanner;

/**
 * Created by KarlJones on 21/06/2018.
 *
 * Class to hold the methods for converting the int into roman numerals.
 */
public class Converter implements RomanNumberalGenerator{

    public Converter(){}

    /**
     * Ask the user for an input into the system. This method validates the input as a number and inside the range.
     * @return the number a user inputs.
     */
    public int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");

        try {
            return Integer.parseInt(scanner.next());
        } catch (NumberFormatException e){
            System.out.println("Sorry, that does not look like a valid number");
        }
        return -1;
    }

    @Override
    public String generate(int number) {
        // Check if this is a valid number before continuing.
        if (!validateInput(number))
            return " is not a valid roman numeral, please try again";

        String romanConversion = "";


        while (number >= 1000) {
            romanConversion += "M";
            number -= 1000;
        }
        while (number >= 900) {
            romanConversion += "CM";
            number -= 900;
        }
        while (number >= 500) {
            romanConversion += "D";
            number -= 500;
        }
        while (number >= 400) {
            romanConversion += "CD";
            number -= 400;
        }
        while (number >= 100) {
            romanConversion += "C";
            number -= 100;
        }
        while (number >= 90) {
            romanConversion += "XC";
            number -= 90;
        }
        while (number >= 50) {
            romanConversion += "L";
            number -= 50;
        }
        while (number >= 40) {
            romanConversion += "XL";
            number -= 40;
        }
        while (number >= 10) {
            romanConversion += "X";
            number -= 10;
        }
        while (number >= 9) {
            romanConversion += "IX";
            number -= 9;
        }
        while (number >= 5) {
            romanConversion += "V";
            number -= 5;
        }
        while (number >= 4) {
            romanConversion += "IV";
            number -= 4;
        }
        while (number >= 1){
            romanConversion += "I";
            number -= 1;
        }

        return " is \'" + romanConversion + "\'";
    }

    /**
     * Validate the input that the user has entered. This ensures that the number is within the range of 1 to 3999.
     * @param number to check is within parameters.
     * @return true if this is valid, false otherwise.
     */
    private boolean validateInput(int number){
        if (number > 3999 || number < 1){
            System.out.println("Please choose a number between 1 and 3999");
            return false;
        }
        return true;
    }
}
