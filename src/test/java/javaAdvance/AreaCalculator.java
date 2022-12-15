package javaAdvance;

import java.util.Scanner;

public class AreaCalculator {
	double width;
	double length;
	private Scanner scanner = new Scanner(System.in);
	
	public AreaCalculator() {
		width = 5;
		length = 5;
		System.out.println("Default");
	}

	public AreaCalculator(double length, double width) {
		this.width = width;
		this.length = length;
		System.out.println("Coustom");
	}

	public static void main(String args[]) {
		AreaCalculator areaCalculator = new AreaCalculator();
//		double length = getRoomLength();
//		double length = areaCalculator.getRoomLength();
//		double width = areaCalculator.getRoomWidth();
		areaCalculator.scanner.close();
		
		System.out.println(areaCalculator.length * areaCalculator.width);
		AreaCalculator areaCalculator1 = new AreaCalculator(25.0, 25.0);
		System.out.println(areaCalculator1.length * areaCalculator1.width);
		
		
//		double area = AreaCalculator.calculateTotalArea(kitchen, bathroom);
//		System.out.println("The total area is: " + area);
	}


	public double getRoomLength() {
		System.out.println("Enter the length of your room:");
		double length = scanner.nextDouble();
		return length;
	}
	
	public double getRoomWidth() {
		System.out.println("Enter the width of your room:");
		double width = scanner.nextDouble();
		return  width;
	}
}
