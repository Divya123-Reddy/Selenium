package com.AttraNestedClass;

public class Vehicle {
	private int speed=90;
	public void workType() {
		System.out.println("an automatic with petrol as fual");

		

	}
	class Car{
		void drive() {
			System.out.println("this car runs with speed of"+speed+"mph");
			workType();
			
		}
	}
	public static void main(String[] args) {
		System.out.println("program started..");
		Vehicle vehicle=new Vehicle();
		Car car=vehicle.new Car();
		car.drive();
		
		System.out.println("program completed....");
		
		
	}

}
