package com.tcs.datastructures.arraysorting;

import java.util.Arrays;

class SelectionSortingExample {
//	{3,2,1}
	public static int[] selectionSort(int[] array,int length) {
		int minIndex=0;
		int temp=0;
		for(int i=0;i<length-1;i++) {
			minIndex=i;//1
			for(int j=i+1;j<length;j++) {
				if(array[minIndex]>array[j]) {
					minIndex=j;
				}
			}
			temp=array[minIndex];//1
			array[minIndex]=array[i];//3
			array[i]=temp;//1
		}
		return array;
	}
}
public class SelectionSorting {
	public static void main(String[] args) {
		int[] array= new int[]{3,2,1};
		array=SelectionSortingExample.selectionSort(array, array.length);
		System.out.println(Arrays.toString(array));
	}
}
