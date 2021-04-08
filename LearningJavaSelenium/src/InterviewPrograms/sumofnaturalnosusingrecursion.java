package InterviewPrograms;

import java.util.Scanner;

public class sumofnaturalnosusingrecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of terms");
		
		int no = sc.nextInt();
		
		//In Java, a method that calls itself is known as a recursive method. And, this process is known as recursion.

		int result = addno(no);
		
		System.out.println("the sum of " + no + " natural nos are " + result);
		
	}
	
	public static int addno(int n) 
		{
		
			
			if(n!=0)
				{
					return n + addno(n-1); //how it works //in first iteration it is returning 5 + function call addno(4)//in second iteration addno(4) is called which is returning 5+4+addno(3) and so on...
				}
			else
				{
					return n;
				}
		
		}

}
