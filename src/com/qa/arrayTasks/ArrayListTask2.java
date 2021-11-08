package com.qa.arrayTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ArrayListTask2 {


	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<>();					
		
		numbers.add(10);										
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		for (int i : numbers) {									
			
			System.out.println(i);
		}
		
		for (int i = 0; i < numbers.size(); i++) {				
			
			System.out.println(numbers.get(i));
		}
		
		System.out.println(numbers.get(2));
		
		numbers.set(0, 1000);
		System.out.println(numbers);
		
		numbers.remove(0);
		System.out.println(numbers);
		
		numbers.set(0, 45);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
	
		Collections.reverse(numbers);
		System.out.println(numbers);
		
		Collections.swap(numbers, 2, 3);
		System.out.println(numbers);
		
		ArrayList <Integer> clone = new ArrayList(numbers);
		System.out.println(clone + "cloned");

	}

}