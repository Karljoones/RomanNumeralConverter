package net.karljones;

import net.karljones.converter.Converter;

public class Main{

    public static void main(String[] args) {
	    System.out.println("Welcome, enter \'0\' to exit");

        Converter converter = new Converter();
        int userInput;

        do {
            userInput = converter.getUserInput();
            if (converter.validateInput(userInput) && userInput != 0) {
                System.out.println(userInput + " = " + converter.generate(userInput));
            }
        } while (userInput != 0);

        System.out.println("Thanks for visiting, application will now terminate.");
    }
}
