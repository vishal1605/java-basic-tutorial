package com.java.file_handling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoveFile {

	public static void main(String[] args) throws IOException {
		
		//Method of moving part 1
//		Path path = Files.move(Paths.get("C:\\Users\\vishal\\eclipse-workspace\\JavaTutorial\\src\\myfile.txt"),
//				Paths.get("myfile.txt"));
//		
//		if(path != null)
//        {
//            System.out.println("File renamed and moved successfully");
//        }
//        else
//        {
//            System.out.println("Failed to move the file");
//        }
		
		//Method of moving part 2
		File file = new File("C:\\Users\\vishal\\eclipse-workspace\\JavaTutorial\\src\\myfile.txt");
		if(file.renameTo(new File("myfile.txt"))) {
			file.delete();
			System.out.println("File Moved successfully");
			
		}else {
			System.out.println("Operation failed");
		}
		

	}

}
