package InterviewPrograms.Array;

public class printarrayinreverseorder {

	public static void main(String[] args) {

		int arr1[] = {23,45,67,89,45,98,45};
		
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i] + "  ");
		}

	}

}
