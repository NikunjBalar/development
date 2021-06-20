package com.bridgelabz.selenium.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridgelabz.selenium.base.Base;

public class NewsHeadings extends Base {

	public static int getPoint(String text) {

		String[] arr = text.split(" ");

		String word = arr[0];
		Integer point = Integer.parseInt(word);
		return point;
	}

	public void getHeadings() {
		List<WebElement> elements = driver.findElements(By.className("storylink"));
		List<String> headinglist = new ArrayList<String>();
		List<WebElement> points = driver.findElements(By.className("score"));
		for (WebElement heading : elements) {
			String text = heading.getText();
			headinglist.add(text);
		}
		
		List<Integer> scores = new ArrayList<Integer>();
		for (WebElement point : points) {
			String text = point.getText();
			int score = getPoint(text);
			scores.add(score);
		}
		
		int max = Collections.max(scores);
		HashMap<Integer, String> news = new HashMap<Integer, String>();
		for (int i = 0; i < scores.size(); i++) {
			news.put(scores.get(i), headinglist.get(i));
		}
		System.out.println("Heading of popular news among the list of news at current time is as bellow");
		System.out.println("Heading : "+news.get(max) + " \nScore :" + max + " point");
	}
}