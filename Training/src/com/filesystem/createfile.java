package com.filesystem;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
		System.out.println("starting the program...");
		try {
			for(int i=0;i<5;i++) {
				File file = new File("D:\\trainee\\sample1.txt"+i+".txt");
				boolean iscreate = file.createNewFile();
				
			
			if (iscreate) {
				System.out.println("File created successfully....");

			} else {
				System.out.println("File couldn't created...");

			}
			}
		} catch (IOException e) {
			System.err.println("Error while creating the file....");
			e.printStackTrace();
		}

	}

}
