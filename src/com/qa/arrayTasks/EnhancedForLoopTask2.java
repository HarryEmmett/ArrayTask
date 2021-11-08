package com.qa.arrayTasks;

// Create array of ints 1-20, use a enhanced for loop to square then print each value.

public class EnhancedForLoopTask2 {


	public static int[] numberArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	public static void main(String[] args) {

		for (int i : numberArray2) {

			System.out.println(i*i);
		}

	}

}