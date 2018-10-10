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
		randomInt = input.nextInt();
		System.out.println("you got it!");
    }
}
