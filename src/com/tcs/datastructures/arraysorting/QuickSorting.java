package com.tcs.datastructures.arraysorting;

class QuickSortingExample {

	public static void quickSorting(int[] array, int low, int high) {
		
		if(low<high) {
			int pi = partition(array,low,high);
			quickSorting(array, low, pi-1);
			quickSorting(array, pi+1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int i=low-1;
		int pivot=array[high];
		for(int j=low;j<high;j++) {
			if(array[j]<pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}
	
}

public class QuickSorting {
	public static void main(String[] args) {
		int[] array = new int[] {3,4,2,5,1,6};
		int low=0;
		int high=array.length-1;
		QuickSortingExample.quickSorting(array, low, high);
		
		for(int i : array) {
			System.out.print(i+" ");
		}
		
		
	}
}
