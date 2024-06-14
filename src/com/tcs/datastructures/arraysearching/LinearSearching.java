package com.tcs.datastructures.arraysearching;

import java.util.Arrays;

class LinearSearchingExample {
	public static int linearSearching(int[] arrayList,int targetValue) {
		for(int i=0;i<arrayList.length-1;i++)
			if(arrayList[i]==targetValue)
				return i;//if value found return index value.
		return -1;//if value not found returning -1.
	}
}

public class LinearSearching {
	public static void main(String[] args) {
		int[] array = new int[] { 5, 8, 1, 12, 15, 20, 25, 30, 45, 50, 62 };
		Arrays.sort(array);
//		Staring time to Execute linear Searching Operation.
		long startingTime=System.nanoTime();
		System.out.println(LinearSearchingExample.linearSearching(array,90));
//		End time to complete linear Searching Operation.
		long endingTime=System.nanoTime();
		
		System.out.println(endingTime-startingTime);
		
	}
}
