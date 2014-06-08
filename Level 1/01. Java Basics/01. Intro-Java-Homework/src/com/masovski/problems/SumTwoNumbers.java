package com.masovski.problems;
import java.util.Scanner;

public class SumTwoNumbers {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		int sum = firstNum + secondNum;
		
		System.out.println("The result is: " + sum);
	}
}
