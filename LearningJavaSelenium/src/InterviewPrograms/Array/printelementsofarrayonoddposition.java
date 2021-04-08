package InterviewPrograms.Array;

public class printelementsofarrayonoddposition {

	public static void main(String[] args) {
		 //Note - Position & indices are different
		//The task is to print all the elements that are present in even position. 
		//Consider an example, we have an array of length 6, 
		//and we need to display all the elements that are present in 2,4 and 6 positions i.e; at indices 1, 3, 5. 
		
		int arr1[] = {23,45,67,89,45,98,45};
		
		System.out.println("Elements of given array present on even position: ");
		
		for(int i=0;i<=arr1.length-1;i=i+2) //for loop works on the basis of indices 
		{
			System.out.println(arr1[i]);
		}
	}

}
