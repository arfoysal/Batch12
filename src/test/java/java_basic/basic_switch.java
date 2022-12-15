package java_basic;

import java.util.Scanner;

public class basic_switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Subject Grsde: ");
		String grade = scanner.next();
		
		String message = "";
		switch (grade.toUpperCase()) {
			case "A":
				message = "Great";
				break;
			case "B":
				message = "Good";
				break;
			default:
				message = "Invalid";
		}
		System.out.println(message);

	}

}
