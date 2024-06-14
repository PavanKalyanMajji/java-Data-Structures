package com.tcs.datastructures.arraysearching;

import java.util.Arrays;

class BinarySearchingExample {
	public static int binarySearching(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;// return -1 if not found value in array;
	}
}

public class BinarySearching {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 8, 1, 12, 15, 20, 25, 30, 45, 50, 62 };
		Arrays.sort(array);
		// Staring time to Execute linear Searching Operation.
		long startingTime = System.nanoTime();
		System.out.println(BinarySearchingExample.binarySearching(array, 45));
//		End time to complete linear Searching Operation.
		long endingTime=System.nanoTime();
		System.out.println(endingTime-startingTime);
	}
}
