package InterviewPrograms;

import java.util.Scanner;

public class checkleapyear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year");
		
		int yr = sc.nextInt();
		
		if(yr%4==0)
		{
			if(yr%100==0) //if its true then its a century year 'yrs ending with 00 eg.1900 etc'
			{             //the reason we are checking the below condition is that eg 1900 is divisible by 4 but is not a leap yr
				if(yr%400==0) //to check if the century yr is a leap yr it should be divisible by 400
				{
					System.out.println("year " + yr + " is a leap year");
				}
				else
				{
					System.out.println("year " + yr + " is not a leap year");
				}
			}
			else
			{
				System.out.println("year " + yr + " is a leap year");
			}
		}
		else
		{
			System.out.println("year " + yr + " is not a leap year");
		}
		}

	}


