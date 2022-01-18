package com.java.rough;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
//		Date date = new Date();
//		String format = new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		String date = "2021-12-21";
		Date parse= null;
		try {
			parse = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(parse);

	}

}
