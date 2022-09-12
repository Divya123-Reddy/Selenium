package Serilalization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		System.out.println("Deserialization program started");
		ObjectInputStream inputStream=null;
		try {
			FileInputStream fileinputstream=new FileInputStream("D:\\Serialization\\Employee.txt");
			inputStream=new ObjectInputStream(fileinputstream);
			Employee emp=(Employee)inputStream.readObject();
			System.out.println("the state of deserialized oject is");
			System.out.println(emp.toString());
			inputStream.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}

}
