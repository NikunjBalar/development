package com.jokerapp.filehanling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
	public static void main(String[] args) {
		System.out.println("main method started");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader("D:\\java\\bufferWriting.txt");
			bufferedReader = new BufferedReader(fileReader);
			String msg =null;
			while((msg=bufferedReader.readLine())!=null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main method ended");
	}
}
