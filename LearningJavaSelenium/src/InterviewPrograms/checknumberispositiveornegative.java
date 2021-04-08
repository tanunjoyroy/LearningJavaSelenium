package InterviewPrograms;

import java.util.Scanner;

public class checknumberispositiveornegative {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		//we will declare a double because a number could be anything decimal,positive/negative integer & double can store both
		//if the question is restricted to integer we can declare as int
		double num = sc.nextDouble();
		
		if(num>0.0)
		{
			System.out.println(num + " Number is positive ");
		}
		else if(num<0.0)
		{
			System.out.println(num + " Number is negative ");
		}
		else
		{
			System.out.println(num + " Number is zero ");
		}
	}

}
