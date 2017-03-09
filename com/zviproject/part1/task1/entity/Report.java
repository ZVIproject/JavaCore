package com.zviproject.part1.task1.entity;

import java.io.Serializable;

public class Report implements Serializable {
	/**
	 * Needed for working with file
	 */
	private static final long serialVersionUID = 1L;

	private int numberOfGroup;
	private int numberOfReportBook;
	private String surnameOfStudent;
	private int marks[] = new int[4];

	public Report() {
	}

	public Report(int numberOfGroup, int numberOfReportBook, String surnameOfStudent, int[] maks) {
		this.numberOfGroup = numberOfGroup;
		this.numberOfReportBook = numberOfReportBook;
		this.surnameOfStudent = surnameOfStudent;
		this.marks = maks;
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

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] maks) {
		this.marks = maks;
	}

}
