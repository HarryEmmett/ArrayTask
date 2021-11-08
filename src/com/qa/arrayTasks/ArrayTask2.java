package com.qa.arrayTasks;

//create a loop that populates an array with values putputting them at each iteration and times the values by 10

public class ArrayTask2 {

	public static int[] ageArray = new int[10];

	public static void main(String[] args) {

		for (int i = 0; i < ageArray.length; i++) {

			ageArray[i] = i*10;

			System.out.println(ageArray[i]);
			
		}
		
//		System.out.println(ageArray[9]);
	}

}
