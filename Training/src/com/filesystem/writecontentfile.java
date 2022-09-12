package com.filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writecontentfile {

	public static void main(String[] args) throws IOException {
		FileWriter filewriter=null;
		System.out.println("writing into files");
		
		try {
			
			File file=new File("D:\\trainee\\sample4.txt");
			if(!file.exists()) {
				System.out.println("creating new file");
				file.createNewFile();
			}
			System.out.println("writing into file");
			 filewriter=new FileWriter(file);
			filewriter.write("Hi,This is graduate testing training");
			filewriter.write("this is scond line:training is held at Ecity");
			System.out.println("content written successfully");
		} catch (IOException e) {
			System.out.println("No permission to write content..");
			e.printStackTrace();
		}finally {
			filewriter.close();
		}
		

	}

}
