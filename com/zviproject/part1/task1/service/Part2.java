package com.zviproject.part1.task1.service;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Part2 {

	public void resultOfRandom() {
		int prepare = (int) Math.random() * 4 + 1;

		if (prepare == 1) {
			System.out.println("It will be girl");
		} else {
			System.out.println("It will be boy");
		}

		System.out.println("Number is :" + (int) Math.random() * 5 + 1);

	}

	public void commonMyltiple() {
		Scanner input = new Scanner(System.in);
		System.out.print("Input data:  ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();

		while ((firstNumber != 0) && (secondNumber != 0)) {
			if (firstNumber > secondNumber) {
				firstNumber %= secondNumber;
			} else {
				secondNumber %= firstNumber;
			}
		}
		System.out.println(firstNumber + secondNumber);
	}

	public void searchX() {
		Scanner scan = new Scanner(System.in);
		try {
			double nunberOfX;

			System.out.print("\n Input a : ");
			double numberOfA = scan.nextDouble();

			System.out.print("\n Input b : ");
			double numberOfB = scan.nextDouble();

			System.out.print("\n Input c : ");
			double numberOfC = scan.nextDouble();

			double d = (numberOfB * numberOfB) - (4 * numberOfA * numberOfC);

			double x1 = (numberOfB + d) / (2 * numberOfA);
			double x2 = (numberOfB + d) / (2 * numberOfA);

			System.out.println(String.format("x1 = " + x1 + "\t x2 = " + x2));

		} catch (InputMismatchException e) {
			System.out.println("ERROR");
			searchX();
		}
	}

	public void workingWithArray() throws IOException {
		int arr[][] = new int[5][5];

		Scanner keybord = new Scanner(System.in);
		System.out.println("1 - random\n2 - from file");
		int value = keybord.nextInt();

		switch (value) {
		case 1:
			randomData(arr);
			break;

		case 2:
			fromFile(arr);
			break;

		default: {

			System.out.println("error");
			workingWithArray();

			break;
		}

		}

	}

	private int[][] randomData(int arr[][]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = (int) (Math.random() * 91) - 45;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		return arr;
	}

	private int[][] fromFile(int arr[][]) throws IOException {
		final String PATH = "/home/zviproject/Стільниця/DB.sql";

		Scanner scan = new Scanner(new File(PATH));
		System.out.println("From file \n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = scan.nextInt();
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}

		scan.close();
		return arr;
	}

}
