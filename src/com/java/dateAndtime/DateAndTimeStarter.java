package com.java.dateAndtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateAndTimeStarter {

	public static void main(String[] args) throws ParseException {
//		Date date = new Date(2000, 11, 21);
//		System.out.println(date);
		
//		Date date1 = new Date();
//		System.out.println(date1);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");
//		TimeZone timeZone = TimeZone.getTimeZone("Asia/Kolkata");
//		
//		sdf.setTimeZone(timeZone);
//		String format = sdf.format(date1);
//		System.out.println(format);
		
		String date = "10-01-2022";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sdf.parse(date);		
		System.out.println(d);
		
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
//		String s = sdf.format(d);
//		System.out.println(s);
//		
//		Date date = sdf.parse(s);
//		System.out.println(date);
		
		
		
		

	}

}
