package com.zviproject.part1.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner inputData = new Scanner(System.in);
		Part2 tasks = new Part2();
		System.out.println("Change part \n" + "Part 1 - 1\n" + "Part 2 - 2\n" + "Part 3 - 3\n" + "Part 4 - 4");
		int part = inputData.nextInt();

		switch (part) {
		case 1: {
			tasks.commonMyltiple();
			tasks.resultOfRandom();
			tasks.searchX();
			tasks.workingWithArray();
			break;
		}

		case 2: {
			ArrayList<Report> reports = new ArrayList<>();

			System.out.print("Number of students : ");
			int numberOfStudents = inputData.nextInt();

			for (int i = 0; i < numberOfStudents; i++) {

				System.out.println("\nName : ");
				String name = inputData.next();

				System.out.print("\nGroup : ");
				int numberOfGroup = inputData.nextInt();

				System.out.print("\nReport book : ");
				int reportBook = inputData.nextInt();

				Report rep = new Report(numberOfGroup, reportBook, name, addMarks());
				reports.add(rep);
			}

			for (Report show : reports) {
				System.out.println(show.getSurnameOfStudent());
			}

			break;
		}
		}

	}

	public static int[] addMarks() {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Input mark");
			arr[i] = scan.nextInt();
		}
		scan.close();
		return arr;
	}

}
