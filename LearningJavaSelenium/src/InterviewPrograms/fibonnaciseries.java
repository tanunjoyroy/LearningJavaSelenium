package InterviewPrograms;

import java.util.Scanner;

public class fibonnaciseries {

	public static void main(String[] args) {
		//The Fibonacci Sequence is the series of numbers: where The next number is found by adding up the two numbers before it:
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		int t1= 0;
		int t2= 1;
		
		//print the series upto a specific number of terms 
		for(int i=0;i<n;i++)
		{
			System.out.print(t1+",");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			
			
		}
		
		//print the series until a given number here 100
		
		while(t1<n)  //we cant use for loop here because we dont know the number of times the loop has to execute untill it reaches 100
		{
			System.out.print(t1+",");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
		}
	}

}
