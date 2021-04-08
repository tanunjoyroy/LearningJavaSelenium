package InterviewPrograms;

import java.math.BigInteger;

import java.util.Scanner;

public class factorialofanumberusingBIGINTEGER {

	public static void main(String[] args) {
		
		//issue - if we use int datatype we would be getting factorial as 0 from !34 onwards
		//reason - The factorial of 34 is about 3*10^38 - it does not fit into an int, which could hold numbers up to 2*10^9. 
		//The value of 34! would not fit even in a long.
		//solution - If you need to calculate factorials of such large numbers, use BigInteger class instead. 
		//Objects of that class can hold integer values of arbitrary size
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		BigInteger Fact = factorial(n); //euqivalent to int result = factorial(n);
		
		System.out.println("factorial of the number " + n + " is " + Fact);
		}
		
		public static BigInteger factorial(int n) 
	    { 
			if(n==0||n==1)
			{
				return BigInteger.ONE;
			}
			else if(n>1)
			{
				// Initialize result 
				BigInteger f = BigInteger.ONE; //in simpler terms it is equivalent to intializing int fact = 1 in other program
				//Some constant are also defined in BigInteger class for ease of initialization :
				//A = BigInteger.ONE;
				// Other than this, available constant are BigInteger.ZERO 
				// and BigInteger.TEN 
	  
				// Multiply f with 2, 3, ...N 
				for (int i = n; i >=1; i--) 
					f = f.multiply(BigInteger.valueOf(i)); //it is equivalent to fact * x in the other program
	  
					return f; 
			} 
			else
			{
				return BigInteger.ZERO;//when n <0
			
			}
}}
