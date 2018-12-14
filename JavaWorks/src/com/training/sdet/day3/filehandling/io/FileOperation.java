package com.training.sdet.day3.filehandling.io;

import java.io.File;
import java.io.IOException;
//import java.sql.Date;
import java.util.Date;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("Sample.txt");
		
		if(file.exists()){
			System.out.println("File exists");
			//new Date(file.lastModified())
			System.out.println("Last Modified datetime: " + new Date(file.lastModified()));
			System.out.println("Can Read? " + file.canRead());
			System.out.println("Can Write? " + file.canWrite());
			System.out.println("Absolute file path :" + file.getAbsolutePath());
			System.out.println("Path Separator " + File.separator);
			
			//file.delete();
		}else {
			file.createNewFile();
			System.out.println("File created.");
		}
		
		System.out.println("Job done");
	}

}