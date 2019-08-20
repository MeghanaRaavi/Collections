package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArraySort {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < 30; i++) {

			Random rand = new Random();
			int x = rand.nextInt(50) + 1;
			array.add(x);
		}
		System.out.println("Genarated random array is : " + array);
		Collections.sort(array);
		System.out.println("Array in assending order: " + array);
		Collections.sort(array, Collections.reverseOrder());
		System.out.print("Sorted array in dessending order: " + array);

	}
}
