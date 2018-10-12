package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
	{
		double randomDouble = Math.random();
		int randomInt = (int)(randomDouble * 10);
		Scanner input = new Scanner(System.in);
		System.out.println("guess");
		int guess = input.nextInt();
		while(guess != randomInt)
		{
			System.out.println("Guess again");
			guess = input.nextInt();
		}
		System.out.println("you got it!");

		//AI guesser
		int min = 0;
		int max = 100;
		int guesser = (max + min)/2;
		input = new Scanner(System.in);
		System.out.println("Is this your number:" + guesser);
		String answer = input.nextLine();
		if(answer.equals("yes"))
		{
			System.out.println("I did it!");
		}
		else
		{
			input = new Scanner(System.in);
			System.out.println("Higher or lower?");
			String answer = input.nextLine();
			if(answer.equals("higher"))
			{
				min += max/2;
				guesser = (max + min)/2;
				System.out.println("Is this your number:" + guesser);
			}
			else
			{
				max -= max/2;
				guesser = (max + min)/2;
				System.out.println("Is this your number:" + guesser);
			}
		}
		
    }
}
