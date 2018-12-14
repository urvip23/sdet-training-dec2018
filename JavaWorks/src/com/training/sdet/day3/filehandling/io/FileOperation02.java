package com.training.sdet.day3.filehandling.io;

import java.io.File;

public class FileOperation02 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Huser\\Desktop\\My folder"); //Since \ is escape char
		
		String [] list = f.list();
		
		for(String temp : list) {
			//System.out.println(temp);
			
			File file = new File(f,temp);
			//Will print read-only and hidden files
			if(file.isFile() && !file.canWrite() && file.isHidden()){
				System.out.println(file.getName());
			}
		}

	}

}
