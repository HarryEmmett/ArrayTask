package com.qa.arrayTasks;

//create an array that will hold 10 integer values and output each element

public class ArrayTask1 {

	
	public static int[] ageArray = { 60, 10, 6, 20, 73, 40, 19, 29, 27, 4 };

	public static void main(String[] args) {
		
		ageArray[0] = 2;

		for (int i = 0; i < ageArray.length; i++) {

			System.out.println(ageArray[i]);
		}
	}

}
