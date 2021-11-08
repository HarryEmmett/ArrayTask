package com.qa.arrayTasks;

//create a method that outputs true if even, false if odd

public class EnhancedForLoopTask3 {

	public static void main(String[] args) {

		oddEven(1);
		oddEven(2);
		oddEven(3);
		oddEven(4);
		oddEven(5);

	}

	public static void oddEven(int num1) {

		if (num1 % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}