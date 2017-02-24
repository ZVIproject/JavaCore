package com.zviproject.part1.task1.service;

import java.util.Scanner;

public class ReportService {

	public int[] addMarks() {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("Input mark");
			arr[i] = scan.nextInt();
		}
		return arr;
	}

}
