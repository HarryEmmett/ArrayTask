package com.qa.arrayTasks;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//Array List functions

public class ArrayListTask1 {

	public static void main(String[] args) {

		List<String> sandwiches = new ArrayList<>(); // List<Integer> for numbers

		sandwiches.add("Cheese"); // add to the list
		sandwiches.add("Ham");
		sandwiches.add("BLT");

		for (int i = 0; i < sandwiches.size(); i++) { // prints out all the objects in the list

			System.out.println(sandwiches.get(i));
		}

		for (String j : sandwiches) { // prints out all the objects in the list, differnt way

			System.out.println(j);
		}

		System.out.println(sandwiches);

		System.out.println(sandwiches.get(1)); // gets the item from specified index
		sandwiches.set(0, "Chicken"); // reassigns the value in the specified index
		System.out.println(sandwiches);
		sandwiches.remove(0); // removes a value at a specified index
		System.out.println(sandwiches);
		System.out.println(sandwiches.size()); // gives the size of the list
		Collections.sort(sandwiches); // sorts the list in alphabetical order
		System.out.println(sandwiches);

		sandwiches.clear();
		System.out.println(sandwiches);

	}

}
