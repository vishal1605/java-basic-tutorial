package com.java.file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;

public class FileReader {

	public static void main(String[] args) throws Exception {
		
		////Read file using FileInputStream
//		File file = new File("C:/Users/vishal/Desktop/Eclipse backup/HibernateTutorial/src/main/java/com/hibernate/FetchData.java");
//		FileInputStream fis = new FileInputStream(file);
//		int i;
//		while((i=fis.read())!=-1) {
//			System.out.print((char)i);
//		}
		
		File file = new File("Capture3.PNG");
		
//		File file = new File("minion.jpg");
		long length = file.length();
		String mimetype = Files.probeContentType(file.toPath());
		//mimetype should be something like "image/png"
		
		System.out.println(mimetype.split("/")[1]+": "+length+" : "+file.getName());
//		System.out.println(file.getPath());
		
		

		if ((mimetype != null) && ((mimetype.split("/")[1].equals("png") || (mimetype.split("/")[1].equals("jpeg"))))) {
		    System.out.println("it is an image");
		}else {
			System.out.println("Not a image");
		}
		

	}

}
