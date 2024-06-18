package com.tcs.datastructures.arraysorting;

import java.util.Arrays;

class InsertionSortingExample {
//	{3,2,1}
	public static int[] insertionSorting(int[] array,int length) {
		for(int i=1;i<length;i++) {
			int key=array[i];//1
			int j=i-1;//1
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j-=1;
			}
			array[j+1]=key;
		}
		return array;
	}
}

public class InsertionSorting {
	public static void main(String[] args) {
		int[] array=new int[] {3,2,1};
		array=InsertionSortingExample.insertionSorting(array, array.length);
		System.out.println(Arrays.toString(array));
	}
}
