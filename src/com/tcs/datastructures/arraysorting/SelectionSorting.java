package com.tcs.datastructures.arraysorting;

import java.util.Arrays;

class SelectionSortingExample {
	public static int[] selectionSort(int[] array,int length) {
		int minIndex=0;
		int temp=0;
		for(int i=0;i<length-1;i++) {
			minIndex=i;
			for(int j=i+1;j<length;j++) {
				if(array[minIndex]>array[j]) {
					minIndex=j;
				}
			}
			temp=array[minIndex];
			array[minIndex]=array[i];
			array[i]=temp;
		}
		return array;
	}
}
public class SelectionSorting {
	public static void main(String[] args) {
		int[] array= {25,5,10,45,90,15,93,17,1,18};
		System.out.println(Arrays.toString(SelectionSortingExample.selectionSort(array, array.length)));
	}
}
