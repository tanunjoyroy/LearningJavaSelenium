package InterviewPrograms;

import java.util.Scanner;

public class powerofanumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int N = sc.nextInt();
		
		System.out.println("Enter the power index");
		
		int n = sc.nextInt();
		
		long result = 1;
		
		for(int x=1;x<=n;x++)  
		{
			result = result * N;  
		}

		System.out.println("the value of a number " + N + " to the power of " +  n + " is " + result);
		
		//using in built function
		
		System.out.println(Math.pow(N, n));
	}

}
