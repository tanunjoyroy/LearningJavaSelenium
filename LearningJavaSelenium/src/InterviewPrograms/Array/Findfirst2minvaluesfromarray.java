package InterviewPrograms.Array;

public class Findfirst2minvaluesfromarray {

	public static void main(String[] args) {
		int arr[] = {55,67,23,45,23};//{107,100,45,23,4,900,89,2};
		int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
		
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < smallest) 
            {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest) //arr[i] != smallest this condition is to tackle if the smallest no is present multiple times
            {
                secondSmallest = arr[i];
            }
        }
       
        System.out.println("smallest Number is: "  +smallest);
        
        if (secondSmallest == Integer.MAX_VALUE) //to tackle scenario when all the elements in the array are same
            System.out.println("There is no second" + 
                               "smallest element"); 
        else
            System.out.println( " The second Smallest" + 
                               " element is " + secondSmallest); 

	}

}
