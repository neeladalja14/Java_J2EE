package com.basics.practice;

public class App {

	public static void main(String[] args) {
		int value = 7; // value assigned to a variable.
		int[] values; // Array declaration.
		values = new int[3]; // length of array is defined here as 3.

		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.println("Array number starts below :");
		int[] numbers = { 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
