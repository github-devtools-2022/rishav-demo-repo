package com.javatestdemo;

public class MySum {
	
	static int sumofnumbers (int numbers) {
		int output = 0;
		for(int i=1;i<=numbers;i++) {
			output += i;
		}
		return output;
	}
	
	static int addNumbers (int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		int numbers = Integer.parseInt(args[0]);
		System.out.println(sumofnumbers(numbers));
		
	}
}
