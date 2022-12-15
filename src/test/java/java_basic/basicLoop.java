package java_basic;

import java.util.Iterator;
import java.util.Scanner;

import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;

public class basicLoop {

	public static void main(String[] args) {
		Scanner scnner = new Scanner(System.in);
		String run = "m";
		do{
			System.out.println("Enter First Number: ");
			int number = scnner.nextInt();
			System.out.println("Enter 2nd Number: ");
			int number2 = scnner.nextInt();
			int sum = number + number2;
			System.out.println(sum);
			System.out.println("Do you want to run again? type y:");
			run = scnner.next();
		}while (run.equals("y"));
		
//		for(int i= 1; i <=30; i+=10) {
//			System.out.println(i);
//			for(int j=500; j>100; j-=200) {
//				System.out.println(j);
//			}
//		}
		System.out.println("End");
		scnner.close();

	}

}
