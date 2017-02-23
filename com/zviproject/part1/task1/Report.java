package com.zviproject.part1.task1;

import java.util.Scanner;

public class Report {
	private int numberOfGroup;
	private int numberOfReportBook;
	private String surnameOfStudent;
	private int maks[] = new int[4];

	public Report() {
	}

	public Report(int numberOfGroup, int numberOfReportBook, String surnameOfStudent, int[] maks) {
		this.numberOfGroup = numberOfGroup;
		this.numberOfReportBook = numberOfReportBook;
		this.surnameOfStudent = surnameOfStudent;
		this.maks = maks;
	}

	public int getNumberOfGroup() {
		return numberOfGroup;
	}

	public void setNumberOfGroup(int numberOfGroup) {
		this.numberOfGroup = numberOfGroup;
	}

	public int getNumberOfReportBook() {
		return numberOfReportBook;
	}

	public void setNumberOfReportBook(int numberOfReportBook) {
		this.numberOfReportBook = numberOfReportBook;
	}

	public String getSurnameOfStudent() {
		return surnameOfStudent;
	}

	public void setSurnameOfStudent(String surnameOfStudent) {
		this.surnameOfStudent = surnameOfStudent;
	}

	public int[] getMaks() {
		return maks;
	}

	public void setMaks(int[] maks) {
		this.maks = maks;
	}

	public int[] addMarks() {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Input mark");
			scan.nextInt();
		}
		scan.close();
		return arr;dsd
	}

}
