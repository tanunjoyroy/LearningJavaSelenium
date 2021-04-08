package InterviewPrograms.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortArrayUsingCollections_sort {

	public static void main(String[] args) {
		//program to sort an array using collections.sort
		
		//We can use Collections.sort() to sort an array after converting given array to an ArrayList.

		Integer arr[] = {20,10,15,13,90,45,89,23,99};
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		arrList = Arrays.asList(arr);
		
		System.out.println(arrList);
		
		Collections.sort(arrList); //ascending order
		
		System.out.println(arrList);
		
		Collections.sort(arrList,Collections.reverseOrder()); //descending order
		
		System.out.println(arrList);
		
		
		
	}
}


