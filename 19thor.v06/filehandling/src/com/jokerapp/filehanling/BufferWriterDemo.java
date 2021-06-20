package com.jokerapp.filehanling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter("D:\\java\\bufferWriting.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("hi \n");
			bufferedWriter.write("hi /n");
			bufferedWriter.write("hi \r\n");
			bufferedWriter.write("hi \\n");

			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("mian method ended");
	}
}
