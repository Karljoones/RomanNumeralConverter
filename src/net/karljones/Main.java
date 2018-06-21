package net.karljones;

import net.karljones.converter.Converter;

public class Main{

    static int userInput;

    public static void main(String[] args) {
	    System.out.println("Welcome, enter \'0\' to exit");

        Converter converter = new Converter();

        do {
            userInput = converter.getUserInput();
            System.out.println(userInput + converter.generate(userInput));
        } while (userInput != 0);

        System.out.println("Thanks for visiting, application will now terminate.");
    }
}
