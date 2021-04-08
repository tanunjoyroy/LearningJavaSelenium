package InterviewPrograms;

import java.util.Scanner;

public class factorialofanousingrecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of terms");
		
		int no = sc.nextInt();
		
		//In Java, a method that calls itself is known as a recursive method. And, this process is known as recursion.

		int result = factorial(no);
		
		System.out.println("the factorial of " + no + " is " + result);

	}
	
	public static int factorial(int n) 
	{
	
		
		if(n!=0)
			{
				return n * factorial(n-1);//how it works //in first iteration it is returning 5 * function call factorial(4)//in second iteration factorial(4) is called which is returning 5*4*addno(3) and so on...
			}
		else
			{
				return 1;
			}
	
	}

}
