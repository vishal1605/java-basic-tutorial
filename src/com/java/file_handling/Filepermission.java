package com.java.file_handling;

import java.io.File;

public class Filepermission {

	public static void main(String[] args) {
		File file = new File("myfile.txt");
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		
		file.setWritable(true);
		System.out.println("---------------------");
		
		
		System.out.println(file.canExecute());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());

	}

}
