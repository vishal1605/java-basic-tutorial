package com.java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException {

	public static void main(String[] args) {
		System.out.println(20/0); // This type of exception not caught by Compiler so
		                          // it is called as Runtime Exception/Unchecked Exception
		
//		Class.forName("com.mysql.jdbc.Driver");   //This type of exception is caught by Compiler
		                                         // so it is Compile time Exception/ Checked Exception
		
		

	}

}
