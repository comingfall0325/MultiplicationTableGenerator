package day6;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) {
		System.out.println("Enter a number for the multiplication table: ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("Multiplication table for " + number + ":");
		for (int i = 1; i <= 10; i++)
			System.out.println(number + " * " + i + " = " + number*i);

	}

}
