package edu.usfca.cs.cs245;
//Author: Anthony Panisales

public class LinearSearch implements Practice2Search {

	public String searchName() {
		return "Linear";
	}

	public int search(int[] arr, int target) {
		/*The for loop goes through all of the elements
		in the array unless the target is found*/
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (target)) {
				return i;
			}
		}
		return -1;
		
	}

}
