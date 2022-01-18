package com.java.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExperiment {

	public static void main(String[] args) throws IOException {
		
		File myFile = new File("myfile.txt");
		
		// Write in file
		try {
			FileWriter write1 = new FileWriter(myFile);
			write1.write("This is file handling examples \n And in this lession u learn Aloat");
			write1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/// Write in file using FileOutputStream
		
//			FileOutputStream wr = new FileOutputStream(myFile, true);
//			String name="\nVishal";
//			char ch[] = name.toCharArray();
//			for(int i=0;i<name.length(); i++) {
//				wr.write(ch[i]);
//				
//			}
//			wr.close();
		
		
		
		
		//Read frm file using scanner
		
//		try {
//			Scanner sc = new Scanner(myFile);
//			
//			while(sc.hasNextLine()) {
//				String line = sc.nextLine();
//				System.out.println(line);
//				sc.close();
//				
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Using Scanner class but without using loops:
//		try {
//			Scanner sc = new Scanner(myFile);
//			sc.useDelimiter("//Z");
//			System.out.println(sc.next());
//			sc.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		//Delete the file
		
//		if(myFile.delete()) {
//			System.out.println("File delete successfully: "+myFile.getName());
//			
//		}else {
//			System.out.println("Some problem occured");
//		}
		
		
		
		
		
	}

}
