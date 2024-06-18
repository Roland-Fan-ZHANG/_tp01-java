package _tp01;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		// Exercice 3.2
		Scanner scanner = new Scanner(System.in); // Variable scanner de type Scanner
		int value = scanner.nextInt(); // Variable value de type int
		// Exercice 3.1
		System.out.println(value);
		// Exercice 3.5
		System.out.println(value + scanner.nextInt());
		// Exercice 3.6
		System.out.println(value - scanner.nextInt());
		System.out.println(value * scanner.nextInt());
		System.out.println(value / scanner.nextInt());
		System.out.println(value % scanner.nextInt());
	}
}