package com.tcs.datastructures.arraysorting;

import java.util.Arrays;

class BubbleSortingExample {
	public static int[] bubbleSorting(int[] array,int length) {
		for(int i=0;i<length;i++) {
			for(int j=0;j<length-1;j++) {
				if(array[j]>array[j+1]) {
					array[j]=array[j]^array[j+1];
					array[j+1]=array[j]^array[j+1];
					array[j]=array[j]^array[j+1];
				}
			}
		}
		return array;
	}
}
public class BubbleSorting {
	public static void main(String[] args) {
		int[] array={25,5,8,9,36,90,45,80,1};
		System.out.println(Arrays.toString(BubbleSortingExample.bubbleSorting(array,array.length)));
	}
}
