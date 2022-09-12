package com.filesystem;

import java.io.File;
import java.io.IOException;

public class forloop {

	public static void main(String[] args) {
		System.out.println("start the program...");
		File file = new File("D:\\trainee\\sample2");

		try {
			boolean iscreate = file.createNewFile();
			if(iscreate) {
				System.out.println("file is created..");
			}else{
				System.out.println("file is not created");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
