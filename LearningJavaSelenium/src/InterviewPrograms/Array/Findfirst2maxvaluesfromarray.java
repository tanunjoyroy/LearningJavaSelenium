/*Complexity Analysis:Efficient Solution

Time Complexity: O(n). 
Only one traversal of the array is needed.
Auxiliary space: O(1). 
As no extra space is required.*/


package InterviewPrograms.Array;

public class Findfirst2maxvaluesfromarray {

	public static void main(String[] args) {
		
		int arr [] = {77,77,77,77,77};//{107,100,45,23,4,900,89,2};
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
		
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > largest) 
            {
                secondLargest = largest;
                largest = arr[i];
            }
            /* If arr[i] is in between largest and secondLargest */
            else if (arr[i] > secondLargest && arr[i] != largest) //arr[i] != largest this condition is to tackle if the largest no is present multiple times
            {
                secondLargest = arr[i];
            }
        }
        
        System.out.println("Largest Number is: "  +largest);
        
        if (secondLargest == Integer.MIN_VALUE) //to tackle scenario when all the elements in the array are same
            System.out.print("There is no second largest"
                             + " element\n");
        else
            System.out.print("The second largest element"
                             + " is " + secondLargest);
        
        
	}
}

//https://www.techbeamers.com/java-coding-questions-software-testers/