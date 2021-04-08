package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterduplicateelementsinanarrayusinglist {

	public static void main(String[] args) {
		// Write code to filter duplicate elements from an array and print as a list
		
		int arr [] = {10,30,50,10,60,100,30,200,100,10,30,100,30};
		//List<int> duplicatelist = new ArrayList<>();//Not Possible You can only create List of reference types like Integer, String, or your custom type & not primitive types like int,char,boolean,etc.
		//Instead use the Integer class which is a wrapper for int
		
		//Note - Based on the output required by the interviewer use set or list
		List<Integer> duplicatelist = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					
					duplicatelist.add(arr[i]);
					
				}
					
			}
			
		}
		
		System.out.println(duplicatelist);
	}

}
