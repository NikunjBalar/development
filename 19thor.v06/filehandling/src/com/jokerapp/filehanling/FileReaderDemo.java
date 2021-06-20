package com.jokerapp.filehanling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		File file=new File("D:\\java\\fileWriting.txt");
		FileReader fileReader=null;
		try {
			fileReader=new FileReader(file);
			int size=(int) file.length();
			char [] fileArray=new char[size];
			fileReader.read(fileArray);
			
			/*for(char c: fileArray) {
				System.out.print(c);
			}*/
			String msg=new String(fileArray);
			//String msg=fileArray.toString();
			System.out.println(msg);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("main method ending");
	}
}
