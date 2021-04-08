package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class filterduplicateelementsinanarrayusinghashset {

	public static void main(String[] args) {
		
		int arr[] = {10,30,50,10,60,100,30,200,100,10};
		
		//Note - Based on the output required by the interviewer use set or list
		
		//1st Approach 
		//Purpose - Finding & storing the duplicate elements from the array & storing them in a set & printing them
				
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					hs.add(arr[i]);
				}
			}
		}
		
	System.out.println(hs);	
	
	    //2. 2nd Approach
	//Purpose - returning the array with no duplicates
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(4,6,2,4,7,9,6,4,9,1,9,6,0,3,6));
		//utility-instead of using add method multiple times, adding different elements in one go
		HashSet<Integer> HashSet = new HashSet<Integer>(numbers);
		//passing the arraylist in the constructor of hashset which would return a hashset with no duplicate values but the insertion order is NOT maintained
		ArrayList<Integer> numbersListWithNoDup = new ArrayList<Integer>(HashSet);
		//passing the resultant hashset in the constructor of ArrayList
		System.out.println(numbersListWithNoDup);
	
	}}
	
//Note - Based on the output required by the interviewer use set or list(for the 2nd approach(returning the array with no duplicates) you can also go for HashMap check file "Removeduplicateelementsfromarray.java" under InterviewPrograms.Array package