package InterviewPrograms.Array;

import java.util.Arrays;
import java.util.Collections;

public class largestsmallestnumbersinanarray {

	public static void main(String[] args) {
		Integer a[]= {98,90,3,7,2,6,1,7,8,34,76,22,2};
		
	
		int min = Collections.min(Arrays.asList(a));

		// using Collections.max() to find maximum element
		int max = Collections.max(Arrays.asList(a));

		System.out.println("the numbers are:"+Arrays.toString(a)); //Other way is to use for loop to traverse through the elements & print each one of them
		//Returns a string representation of the contents of the specified array. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters “, ” (a comma followed by a space).
		System.out.println("largest number is:"+min);
		System.out.println("smallest number is:"+max);
	}

}
