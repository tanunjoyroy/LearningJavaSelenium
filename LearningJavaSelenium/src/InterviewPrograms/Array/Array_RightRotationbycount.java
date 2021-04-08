package InterviewPrograms.Array;

import java.util.Arrays;

public class Array_RightRotationbycount {

	public static void main(String[] args) {
		
		int arr[] = {2,56,78,23,45};
		
		int n = 2;
		
		 //Rotate the given array by n times toward right    
        for(int i = 0; i < n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        }    
        
		System.out.println(Arrays.toString(arr));
			

	}

}
