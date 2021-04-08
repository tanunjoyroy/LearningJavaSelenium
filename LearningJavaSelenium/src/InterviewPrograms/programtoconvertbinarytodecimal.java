package InterviewPrograms;

import java.util.Scanner;

public class programtoconvertbinarytodecimal {

	public static void main(String[] args) {

		//10011011 base 2 = (start from last digit) 2^0*1 + 2^1*1 + 2^2*0 + 2^3*1 + 2^4*1 + 2^5*0 + 2^6*0 + 2^7*1 = 1+2+0+8+16+0+0+128 = 155 base 10
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a binary number");
		
		long binarynumber = sc.nextLong();
		
		int decimalnumber = 0;
		
		int n =0;
		
		long bin = binarynumber;
		
		while(bin!=0)
			{
				long remainder = bin%10; //always remember a number % 10 returns the decimal digit i.e the last digit
				//decimalnumber = decimalnumber + remainder * Math.pow(2, n); //it will return a double value as pow return a double
				decimalnumber += remainder * Math.pow(2, n); // to display the result in int express the above statement in this manner
				bin = bin/10; //always remember a number/10 returns the number excluding the last digit i.e it shrinks the value
				n++;
			}

			System.out.println("the decimal number equivalent of " + binarynumber + " is " + decimalnumber);
	}

}
