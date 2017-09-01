package edu.usfca.cs.cs245;
//Author: Anthony Panisales

public class BinaryRecursiveSearch implements Practice2Search {

	public String searchName() {
		return "Binary Recursive";
	}
	
	//Initializes min and max
	public int search(int[] arr, int target) {
		int min = 0;
		int max = arr.length - 1;
		return search(arr, target, min, max);
	}

	public int search(int[] arr, int target, int min, int max) {
		int mid = (min + max) / 2;
		//Base case
		if (max < min) {
			return -1;
		}
		//Step case
		if (arr[mid] == (target)) {
			return mid;
		}
		if (arr[mid] > (target)) {
			return search(arr, target, min, mid-1);
		} else {
			return search(arr, target, mid+1, max);
		}

	}

}
