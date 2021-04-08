package InterviewPrograms.Array;

public class find3rdlargestnoinarray {

	public static void main(String[] args) {
		
int arr[] = {10, 5, 15, 5, 15, 10, 1, 1};//{10,45,78,47,23,89,90,43,99,87}; 
		
		// Initialize first, second and third Largest element 
        int first = arr[0], second = Integer.MIN_VALUE, 
                            third = Integer.MIN_VALUE; 
  
        // Traverse array elements to find the third Largest 
        for (int i = 1; i < arr.length; i++) { 
            /* If current element is greater than first, 
        then update first, second and third */
            if (arr[i] > first) { 
                third = second; //MIN_Value
                second = first; //10
                first = arr[i]; //15
            } /* If arr[i] is in between first and second */
            else if (arr[i] > second && arr[i] != first) //arr[i] != first to tackle duplicate elements in array
            { 
                third = second; 
                second = arr[i]; 
            } /* If arr[i] is in between second and third */
            else if (arr[i] > third && arr[i] != second && arr[i] != first) //arr[i] != second && arr[i] != first to tackle duplicate elements in array
            { 
                third = arr[i]; 
            } 
        } 
  
        System.out.printf("The third Largest element is %d\n", third); 
		
		
		
		
			
		
			}

}
