package com.scorpin.problems.timeConversion;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * Purpose : to convert 12 hours time format in 24 hour format
 * 
 * @author Nikunj Balar
 *
 */
public class TimeConversion {
   
    static String timeConversion(String s) throws ParseException {
    	
    	DateFormat df= new SimpleDateFormat("hh:mm:ssaa");
    	DateFormat df2 = new SimpleDateFormat("HH:mm:ss");
    	Date date = null;
    	String timeOutPut =null ;
    	
    	date = df.parse(s);
    	timeOutPut = df2.format(date);
    	return timeOutPut;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
    }
}