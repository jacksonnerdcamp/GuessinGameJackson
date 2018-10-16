package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
	{
		//Here I am asking the user for their name.
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		//Here I am asking the user which game they want to play.
		input = new Scanner(System.in);
		System.out.println("Hello " + name + ", would you like to activate Guessing Game or AI?");
		String typedAnswer = input.nextLine();
		if(typedAnswer.equals("Guessing Game"))
		{
			double randomDouble = Math.random();
			int randomInt = (int) (randomDouble * 10);
			input = new Scanner(System.in);
			System.out.println("Type in your guess, " + name);
			int guess = input.nextInt();
			while (guess != randomInt) {
				System.out.println("Guess again");
				guess = input.nextInt();
			}
			System.out.println("Congratulations, " + name + ", you got it!");
		}
		else if(typedAnswer.equals("AI"))
		{
			//AI guesser
			int min = 0;
			int max = 100;
			int guesser = (max + min) / 2;
			input = new Scanner(System.in);
			System.out.println(name + ", is this your number:" + guesser);
			while (true) {
				String answer = input.nextLine();

				if (answer.equals("yes")) {
					System.out.println("I did it!");
					break;
				} else {
					input = new Scanner(System.in);
					System.out.println("higher or lower?");
					String answer2 = input.nextLine();
					if (answer2.equals("higher")) {
						min = guesser;
						guesser = (max + min) / 2;
						System.out.println(name + ", is this your number:" + guesser);
					} else {
						max = guesser;
						guesser = (max + min) / 2;
						System.out.println(name + ", is this your number:" + guesser);
					}
				}
			}
		}
    }
}
