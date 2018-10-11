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
		int n = 50;
		Scanner input = new Scanner(System.in);
		System.out.println("Is this your number:" + n);
		Boolean answer = input.nextBoolean();
		if(answer)
		{
			System.out.println("I did it!");
		}
		
    }
}
