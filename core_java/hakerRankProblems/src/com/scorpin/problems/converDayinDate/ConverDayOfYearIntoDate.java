package com.scorpin.problems.converDayinDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Nikunj BAlar
 *
 */
public class ConverDayOfYearIntoDate {
	static String dayOfProgrammer(int year) {
		int day=256;
		int diff = 0;
		int feb=28;
		if (year == 1918) {
			diff=13;
		}
		if (year < 1918 && year %4 ==0) {
			feb = 29;
		}else if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			feb = 29 ;
		}
		// sum of 8 months days
		int sum = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31 - diff;
		int date=day-sum;
		String fullDate = date+".09."+year;

		return fullDate;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int year = Integer.parseInt(bufferedReader.readLine().trim());

		String result = dayOfProgrammer(year);

		System.out.println(result);
		bufferedReader.close();
	}
}