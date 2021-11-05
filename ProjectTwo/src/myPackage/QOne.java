package myPackage;

/*
 * Q1: Perform a bubble sort on integer array: [1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4]
 */

public class QOne {
	
	public void myBubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		
		for (int i = 0; i < n-1; i++) {
			swapped = false;
			for (int j = 0; j < n-i-1; j++) {
				
				if (arr[j] > arr[j+1]) {
					// swap the left with the right and save it in a temp variable
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			
			// check to see if a swap occurred by the inner loop (the one with the j)
			if (swapped == false)
				break;
		}
	} 
	 // print the array in the console
	public void printBubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " "); // add space after iteration to seperate values
		System.out.println();
	}
}
