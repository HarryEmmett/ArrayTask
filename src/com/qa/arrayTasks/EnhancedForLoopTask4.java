package com.qa.arrayTasks;

//fucntion that squares odd numbers and cubes even numbers

public class EnhancedForLoopTask4 {

	public static int[] numberArray3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

	public static void main(String[] args) {

		for (int num1 : numberArray3) {

			System.out.println(oddSquaredEvenCubed(num1));
		}
	}

	public static int oddSquaredEvenCubed(int num2) {

		if (num2 % 2 == 0) {
			System.out.print("Even number - cubed: ");
			return num2 * num2 * num2;
		} else {
			System.out.print("Odd number - squared: ");
			return num2 * num2;
		}

	}
}