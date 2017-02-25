package com.zviproject.part1.task1.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.zviproject.part1.task1.entity.Report;

public class ReportService {

	public int[] addMarks() {
		int arr[] = new int[4];
		try {
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < 4; i++) {
				System.out.println("Input mark");
				arr[i] = scan.nextInt();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}

	public void saveToFile(ArrayList<Report> report, String PATH) {
		try {
			FileOutputStream fo = new FileOutputStream(PATH);
			ObjectOutputStream serial = new ObjectOutputStream(fo);
			serial.writeObject(report);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile(String PATH) {
		System.out.println("================From file==================");
		List<Report> listofusers = new ArrayList<>();
		try (FileInputStream fis = new FileInputStream(PATH);
				ObjectInputStream objectInputStream = new ObjectInputStream(fis)) {

			listofusers = (ArrayList) objectInputStream.readObject();

			for (Report show : listofusers) {
				System.out.println("\nGroup : " + show.getNumberOfGroup());
				System.out.println("Report book : " + show.getNumberOfReportBook());
				System.out.println("Surname : " + show.getSurnameOfStudent());
				for (int showMarks : show.getMarks()) {
					System.out.println("Mark : " + showMarks);
				}
			}

		} catch (Exception e) {

		}

	}

}
