package com.filesystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMove {

	public static void main(String[] args) {
		String src="D:\\trainee\\sample1.txt";
		String tar="D:\\trainee\\processed\\sample1.txt";
		System.out.println("program started..");
		File file=new File("D:\\trainee\\processed\\");
		
		if(file.isDirectory()) {
		
		try {
			Path path=Files.move(Paths.get(src),Paths.get(tar));
			System.out.println(path);
			System.out.println("file moved successfully");
		} catch (IOException e) {
			System.err.println("File couldn't be moved");
			e.printStackTrace();
		}
		

	}

}
}