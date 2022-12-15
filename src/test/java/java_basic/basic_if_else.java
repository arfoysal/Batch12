package java_basic;

import java.util.Scanner;

public class basic_if_else {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		
		int number = scanner.nextInt();
		System.out.println("Enter 2nd Number: ");
		
		int number2 = scanner.nextInt();
		int sum = number + number2;
		if(sum%2 == 0 && sum >= 0) { 
			System.out.println("The result is even and " + "Result is positive" );
		}
		else if(sum%2 != 0 && sum>=0){
			System.out.println("The result is odd and " + "Result is positive" );
		}
		else if (sum%2 == 0 && sum < 0){
			System.out.println("The result is even and " + "Result is negative" );
		}
		else {
			System.out.println("The result is odd and " + "Result is negative" );

		}
	}

}
