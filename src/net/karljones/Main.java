package net.karljones;

import net.karljones.converter.Converter;

public class Main{

    public static void main(String[] args) {
        System.out.println("Welcome, enter a number to start. Enter \'0\' to exit");

        Converter converter = new Converter();
        int userInput;

        // This loops the program until the user chooses to exit the program.
        do {
            userInput = converter.getUserInput();

            if (userInput != 0 && converter.validateInput(userInput)) {
                System.out.println(userInput + " = " + converter.generate(userInput));
            }
        } while (userInput != 0);

        System.out.println("Thanks for visiting, application will now terminate.");
    }
}
