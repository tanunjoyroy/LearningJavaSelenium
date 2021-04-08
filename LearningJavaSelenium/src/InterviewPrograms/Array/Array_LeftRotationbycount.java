package InterviewPrograms.Array;

import java.util.Arrays;

public class Array_LeftRotationbycount {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5};
		
		int n = 1;  
        
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++)
        {  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  //first = 1
            for(j = 0; j < arr.length-1; j++)
            {  
                //Shift element of array by one  
                arr[j] = arr[j+1]; //arr[0]=2,arr[1]=3,arr[2]=4,arr[3]=5 
                
            } 
            
            //First element of array will be added to the end  
            	arr[arr.length-1] = first;  
        	}  
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        
        System.out.println(Arrays.toString(arr));
		


	}

}
