package InterviewPrograms;

import java.util.Scanner;

public class largestamong3nos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		
		int num1 = sc.nextInt();
		
		
		
		System.out.println("Enter the second number");
		
		int num2 = sc.nextInt();
		
		
		
		System.out.println("Enter the third number");
		
		int num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("num1 " + num1 + " is the greatest number");
			
		}
		else if(num2>=num3)
		{
			System.out.println("num 2 " + num2 + " is the greatest number");
		}
		else{
		
			System.out.println("num3 " + num3 + " is the greatest number");
		}
		
		//using nested if...else statement
		/*
		 * if(n1 >= n2) 
		 * { 
		 * 		if(n1 >= n3) 
		 * 			System.out.println(n1 + " is the largest number."); 
		 * 		else 
		 * 			System.out.println(n3 + " is the largest number."); 
		 * } 
		 * else 
		 * { 
		 * 		if(n2 >= n3) 
		 * 			System.out.println(n2 + " is the largest number."); 
		 * 		else 
		 * 			System.out.println(n3 + " is the largest number."); 
		 * }
		 */
	}

}
