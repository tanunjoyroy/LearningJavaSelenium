package InterviewPrograms.Array;

public class findsmallestnoinarray {

	public static void main(String[] args) {
		int arr[] = {10,100,45,23,900,89,2};
		int smallest = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		
		System.out.println(smallest);

	}

}
