package InterviewPrograms;

import java.util.Arrays;

public class findmultiplemissingnos {

	public static void main(String[] args) {
		
		int arr[] = {54,10,34,12,9};
		
		Arrays.sort(arr);
		//int currentnumber = arr[0]; //use when you want to find missing numbers from the lowest value in the array
		int currentnumber = 1; //use when you want to find missing numbers from 1
		
		//here we will compare actual & expected value
		//expected value pointer will be computed by currentnumber after each iteration
		//actual value pointer will be computed by the for loop in each iteration
		//this logic will work in finding missing numbers in any range
		for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=currentnumber)
				{
					for(int j =currentnumber;j<arr[i];j++)
					{
						System.out.println(" the missing number is: " + j );
					}
					
				}
				
				currentnumber = arr[i]+1; 
			}

	}

}
