package InterviewPrograms.Array;

import java.util.Arrays;

public class Copyelementsfromonearraytoother {

	public static void main(String[] args) {
		
		int arr1[] = {34,45,32,56};
		
		//creating another array arr2 of the same size as arr1
		int arr2[] = new int[arr1.length];
		
		//Method1: without using in built method
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		
		
		for(int j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
		System.out.println("*********");
		
		//If we make any changes to arr2[] it wont affect arr1[]
		
		arr2[1]++;
		
		for(int j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
		
		System.out.println("_____");
		
		//Method2: Using in built method clone()
		
		int arr3[] = arr1.clone();
		
		
		for(int y=0;y<arr3.length;y++)
		{
			System.out.println(arr3[y]);
		}
		
		//If we make any changes to arr3[] it wont affect arr1[]
		
		System.out.println("_____");
		
		arr3[2]--;
				
		for(int j=0;j<arr3.length;j++)
		{
			System.out.println(arr3[j]);
		}
				
		System.out.println("$$$$$");
				
		//Method3: Using in built method Arrays.copyOf(Original array,length of the new array)
		
		int[] org = new int[] {1, 2 ,3}; 
		  
        System.out.println("Original Array"); 
        for (int i = 0; i < org.length; i++) 
            System.out.print(org[i] + " "); 
  
        // copying array org to copy 
        int[] copy = Arrays.copyOf(org, 5); 
  
        // Changing some elements of copy 
        copy[3] = 11; 
        copy[4] = 55; 
  
        System.out.println("\nNew array copy after modifications:"); 
        for (int i = 0; i < copy.length; i++) 
            System.out.print(copy[i] + " "); 
		
        
}
}
