package com.java.java8features.DateTimeAPI.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javafx.util.converter.LocalDateTimeStringConverter;

public class DateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime date=LocalDateTime.now();

		System.out.println("Today's date" + LocalDate.now());
		System.out.println("old date " + LocalDate.of(1999, 9, 15));

		System.out.println("time is now" + LocalTime.now());
		System.out.println("old time " + LocalTime.of(10, 45));

		System.out.println("Currunt date and time" + LocalDateTime.now());

		System.out.println("timeStamp" + LocalDateTimeStringConverter.class);

		System.out.println("convert formate");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss");
		System.out.println(date.format(formatter));
		
		ZonedDateTime zonedDateTime=ZonedDateTime.now();
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.getZone());
		System.out.println(zonedDateTime.getDayOfMonth());
		System.out.println(zonedDateTime.getDayOfYear());
		System.out.println(zonedDateTime.getHour());
		System.out.println(zonedDateTime.getMonthValue());
		System.out.println(zonedDateTime.getMinute());
		System.out.println(zonedDateTime.getSecond());
		System.out.println(zonedDateTime.getYear());
		System.out.println(zonedDateTime.getClass());
		System.out.println(zonedDateTime.getDayOfWeek());
		System.out.println(zonedDateTime.getMonth());
		System.out.println(zonedDateTime.getOffset());
		System.out.println(zonedDateTime.getNano());
		

		

		
	}
}
