package com.java.file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {

	public static void main(String[] args) throws Exception {
		
		////Read file using FileInputStream
		File file = new File("C:/Users/vishal/Desktop/Eclipse backup/HibernateTutorial/src/main/java/com/hibernate/FetchData.java");
		FileInputStream fis = new FileInputStream(file);
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		

	}

}
