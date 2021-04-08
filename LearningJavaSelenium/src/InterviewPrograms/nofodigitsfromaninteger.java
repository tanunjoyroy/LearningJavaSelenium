package InterviewPrograms;

import java.util.Scanner;

public class nofodigitsfromaninteger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		if(num<0)
		{
			num = num * -1;
		}
		else if(num==0)
		{
			num = 1;
		}
		
		int count = 0;
		
		while(num !=0)
		{
			num = num/10;
			count = count +1;
		}
		System.out.println("the no of digits in the number are : " + count);
		
		
	    //if we give number as 01 the result would be 1 digit which means 0 wont be considered at all
		//if we give 10 it would be 2 digits obviously
	}
	

}
