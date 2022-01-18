package com.java.dateAndtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTime {

	public static void main(String[] args) {
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
		
		
//		
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
		
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime.getMinute());
//		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
//		DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");
//		String s = pattern.format(dateTime);
//		String f = pattern2.format(dateTime);
//		System.out.println(s);
//		System.out.println(f);
		
		
		LocalDate from = LocalDate.of(2022, 01, 01);
		LocalDate to = LocalDate.of(2022, 01, 10);
		
//		if(from.equals(to)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not equal");
//		}
		
		if(to.isBefore(from)) {
			System.out.println("before");
		}else {
			System.out.println("Not before");
		}
		
		if(to.isAfter(from)) {
			System.out.println("after");
		}else {
			System.out.println("Not after");
		}

	}

}
