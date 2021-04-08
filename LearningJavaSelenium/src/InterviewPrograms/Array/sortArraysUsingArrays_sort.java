package InterviewPrograms.Array;

import java.util.Arrays;
import java.util.Collections;

public class sortArraysUsingArrays_sort {

	public static void main(String[] args) {
		
		int[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; 
		  
        // Sort subarray from index 1 to 4, i.e., 
        // only sort subarray {7, 6, 45, 21} and 
        // keep other elements as it is. 
        Arrays.sort(arr, 1, 5); 

	System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); //always use Arrays.toString to print the array -- to print the string representation of array

//3.We can also sort in descending order.
         // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        Integer[] arr1 = {13, 7, 6, 45, 21, 9, 2, 100}; 
  
        // Sorts arr[] in descending order 
        Arrays.sort(arr1, Collections.reverseOrder()); 

	System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr1));

//4.We can also sort strings in alphabetical order.

String arr2[] = {"practice.geeksforgeeks.org", 
                        "quiz.geeksforgeeks.org", 
                        "code.geeksforgeeks.org"
                       }; 
  
        // Sorts arr[] in ascending order 
        Arrays.sort(arr2); 
        System.out.printf("Modified arr[] : \n%s\n\n", 
                          Arrays.toString(arr2)); 
  
        // Sorts arr[] in descending order 
        Arrays.sort(arr2, Collections.reverseOrder()); 
  
        System.out.printf("Modified arr[] : \n%s\n\n", 
                          Arrays.toString(arr2)); 






	}

}
