package com.jokerapp.filehanling.createordelet;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {

		System.out.println("main meethod Started");

		File file = new File("D:\\java\\filehandlind.txt");
		try {
			if (file.exists()) {
				System.out.println("fle is already exist");
			} else {

				file.createNewFile();
				System.out.println("created the file");
			}
		} catch (IOException e) {
			System.out.println("exception in IOException" + e.getMessage());
		}

		System.out.println("main meethod Ended");

	}
}
