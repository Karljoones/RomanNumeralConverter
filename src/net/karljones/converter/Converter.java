package net.karljones.converter;

import java.util.Scanner;

/**
 * Created by KarlJones on 21/06/2018.
 *
 * Class to hold the methods for converting the int into roman numerals.
 */
public class Converter implements RomanNumberalGenerator{

    private static final int MAX_NUM = 3999;
    private static final int MIN_NUM = 1;
    private int[] numeralSteps = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

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
            e.printStackTrace();
            System.out.println("Sorry, that does not look like a valid number");
        }
        return -1;
    }

    /**
     * Generate a roman numeral when given an int to convert from.
     * @param number to convert into a roman numeral.
     * @return a string variable of the converted roman numeral.
     */
    @Override
    public String generate(int number) {

        // Check if this is a valid number before continuing.
        if (!validateInput(number)) {
            return " is not a valid roman numeral, please try again";
        }

        String convertedNumber = "";

        // Loop through the steps of the roman numerals, subtracting steps from the total as it goes.
        for (int i = 0; i < numeralSteps.length ; i++){
            while(number >= numeralSteps[i]){
                convertedNumber = convertedNumber.concat(numerals[i]);
                number -= numeralSteps[i];
            }
        }

        return convertedNumber;
    }

    /**
     * Validate the input that the user has entered. This ensures that the number is within the range of 1 to 3999.
     * @param number to check is within parameters.
     * @return true if this is valid, false otherwise.
     */
    public boolean validateInput(int number){
        if (number > MAX_NUM || number < MIN_NUM) {
            System.out.println("Please choose a number between 1 and 3999");
            return false;
        }
        return true;
    }
}
