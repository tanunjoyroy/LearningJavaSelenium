package InterviewPrograms;

import java.util.Scanner;

public class factorialofanumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		int result = factorial(n);
		
		System.out.println("factorial of the number " + n + " is " + result);
		
	}
		
		public static int factorial(int n)
		{
		if(n == 0 || n==1)
			{
				return 1;
			}
		else if(n>1)
			{
				int fact = 1;
				for(int x=n;x>=1;x--)
					{
						fact = fact * x;
					}
				return fact;
			}
		else
		{
			return 0; //in case of n<0
		}

		
		//note in maths factorial of 0 is 1
		//even here when n = 0 loop is not entered hence fact is 1 

		}
}


