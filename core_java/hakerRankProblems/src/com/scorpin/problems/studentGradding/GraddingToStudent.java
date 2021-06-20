package com.scorpin.problems.studentGradding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Purpose : To give grade to student 1. increase the student grades near to
 * next value that is divisible by 5 2. if the difference between old and new
 * grade is less then 3 then consider new grades else consider old grades. 3.if
 * the new grade is less then 40 then consider old grade only
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class GraddingToStudent {

	public static List<Integer> gradingStudents(List<Integer> grades) {

		for (int i = 0; i < grades.size(); i++) {
			int grade = grades.get(i);
			int div = grade / 5;
			int newGrade = 5 * (div + 1);

			if (newGrade >= 40 && newGrade - grade < 3) {
				grades.set(i, newGrade);
			}
		}
		return grades;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
			try {
				return bufferedReader.readLine().replaceAll("\\s+$", "");
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}).map(String::trim).map(Integer::parseInt).collect(toList());

		List<Integer> result = gradingStudents(grades);

		System.out.println(result);

		bufferedReader.close();
	}
}
