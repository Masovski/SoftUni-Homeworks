package com.masovski.problems;
import java.util.Arrays;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		String[] strArr = new String[n];
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.next();
		}
		Arrays.sort(strArr);
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
