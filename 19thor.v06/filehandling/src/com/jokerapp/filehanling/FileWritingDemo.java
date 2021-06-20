package com.jokerapp.filehanling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

	public static void main(String[] args) {
		System.out.println("main method started");

		File file = new File("D:\\java\\fileWriting.txt");

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			//fileWriter.write("hello welcom hasi");
			fileWriter.append("hi nikunj");
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("main method started");
	}
}
