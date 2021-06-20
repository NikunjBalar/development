package com.java.Exception.ChekedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ChekedExceptionDemo {
	public static void main(String[] args) {
		try {
			FileReader file =new FileReader("D:\\java\\taxt1.txt");
			BufferedReader fileIput = new BufferedReader(file);
			
			for (int i = 0; i <3; i++) {
				System.out.println(fileIput.readLine());
				
			}
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method complated");
	}
}
