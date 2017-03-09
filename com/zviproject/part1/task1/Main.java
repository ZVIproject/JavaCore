package com.zviproject.part1.task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.zviproject.part1.task1.entity.Report;
import com.zviproject.part1.task1.service.Part2;
import com.zviproject.part1.task1.service.ReportService;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner inputData = new Scanner(System.in);
		final String PATH = "/home/zviproject/Стільниця/Reports.txt";
		Part2 tasks = new Part2();
		System.out.println("Change part \n" + "Part 1 - 1\n" + "Part 2 - 2\n" + "Part 3 - 3\n" + "Part 4 - 4");

		try {
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
				ReportService reportService = new ReportService();

				System.out.print("Number of students : ");
				int numberOfStudents = inputData.nextInt();

				for (int i = 0; i < numberOfStudents; i++) {

					System.out.println("\nName : ");
					String name = inputData.next();

					System.out.print("\nGroup : ");
					int numberOfGroup = inputData.nextInt();

					System.out.print("\nReport book : ");
					int reportBook = inputData.nextInt();

					Report rep = new Report(numberOfGroup, reportBook, name, new ReportService().addMarks());

					reports.add(rep);

				}

				Collections.sort(reports, new Comparator<Report>() {
					public int compare(Report r1, Report r2) {
						return r1.toString().compareTo(r2.toString());
					}
				});

				reportService.saveToFile(reports, PATH);

				reportService.readFromFile(PATH);
				System.out.println("\nStudents: ");
				for (Report show : reports) {
					System.out.println("Name: " + show.getSurnameOfStudent());
				}

				break;
			}
			}
		} catch (NumberFormatException | InputMismatchException e) {
			System.out.println("ERROR");
		}

	}

}
