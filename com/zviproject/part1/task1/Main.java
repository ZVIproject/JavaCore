package com.zviproject.part1.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner inputData = new Scanner(System.in);
		Part2 tasks = new Part2();
		//
		// tasks.commonMyltiple();
		// tasks.resultOfRandom();
		// tasks.searchX();
		// tasks.workingWithArray();
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
			Report report = new Report();
			Report rep = new Report(numberOfGroup, reportBook, name, report.addMarks());
			reports.add(rep);
		}

		for (Report show : reports) {
			System.out.println(show.getSurnameOfStudent());
		}

	}

}
