package InterviewPrograms;

import java.util.Scanner;

public class palindromenumberornot {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		int actualnum = num;
		
		int rev = 0;

		while(num!=0) 
		{ 
		int n = num % 10;
		rev = rev * 10 + n;
		num = num/10;
		
		}

		
		
		if(actualnum==rev)
		{
			System.out.println("number " + actualnum + " is palindrome");
		}
		else
		{
			System.out.println("number " + actualnum + " is Not palindrome");
		}
	}
}
		
		
