package InterviewPrograms;

import java.util.Scanner;

public class validatearmstrongno {

	public static void main(String[] args) {
		//Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits. . For example 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371,407,1634, 8208, 9474, 54748,etc.. are the Armstrong numbers.
        //it is also called Narcissistic number
		//153 = 1*1*1 +5*5*5+3*3*3;
		//1634 = 1*1*1*1+6*6*6*6+3*3*3*3+4*4*4*4 = 1634
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		
		int number = sc.nextInt();
		
		double countDig = 0;
		
		int j = number;
		while(j>0)
		{
			countDig=countDig+1;
			j = j/10;
			
		}
		
		int i = number;
		
		double sum = 0;
		
		while(i>0)
		{
			double dig = i%10; 
			
			sum = sum + Math.pow(dig, countDig); //using built in method
			
			i = i/10;
			
			
		}
		
		if(sum==number)
		{
			System.out.println("the number " + number + " is an armstrong number ");
		}
		else
		{
			System.out.println("the number " + number + " is not an armstrong number");
		}
			
		//https://www.softwaretestinghelp.com/java-coding-interview-programs/
	}
}
