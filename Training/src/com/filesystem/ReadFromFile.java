package com.filesystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ReadFromFile {

	public static void main(String[] args) {
		Scanner sc = null;
		System.out.println("program started");

		try {
			File file = new File("D:\\trainee\\sample4.txt");
			if (file.exists()) {
				sc = new Scanner(file);
				System.out.println("printing the content of a file");
				while (sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}

			}
			System.out.println(":::::::::::::::::::::");
			System.out.println("can file be read "+file.canRead());
			System.out.println("Does the file have write permission"+file.canWrite());
			System.out.println("The file name is"+file.getName());
			System.out.println("The absolute path of the file is"+file.getAbsolutePath());
			
			sc.close();
			System.out.println("The file deleted"+file.delete());
		} catch (FileNotFoundException e) {
			System.err.println("error while reading the contents from the file");
			e.printStackTrace();
		}

	}
}
