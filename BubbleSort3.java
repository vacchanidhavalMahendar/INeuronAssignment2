package BubbleSortAlgorithm_3;

import java.util.Arrays;

public class BubbleSort3 {
	public static void main(String[] args) {
		int[] arr = {1,7,5,6,9,3};
		
		System.out.println("Array as Before Sorting" + Arrays.toString(arr));
		
		//BubbleSort Technique
		
		
		//Firstly finding the length
		
		
		int len1 = arr.length;
		
		//for loop with number of passed and comparing the element
		
		
		
		for(int i=0;i<len1-1;i++){//Number of passes as per requirement
		
		
		for(int j=0;j<len1-1;j++) { //Iterating or travelling
			if(arr[j]>arr[j+1]) { // first value is greater than second element
				
			int temp = arr[j];
			arr[j]= arr[j+1];
			arr[j+1] = temp;
			}
				
			}
			
			
			
		}
	

System.out.print("Arrays After Sorting:" + Arrays.toString(arr));

}
}
