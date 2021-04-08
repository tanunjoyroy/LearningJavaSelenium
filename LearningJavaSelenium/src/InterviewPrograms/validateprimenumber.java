package InterviewPrograms;

import java.util.Scanner;

public class validateprimenumber {
  //A prime number is a number that is only divisible by 1 or itself. For example, 11 is only divisible by 1 or itself. Other Prime numbers 2, 3, 5, 7, 11, 13, 17....
  //Note: 0 and 1 are not prime numbers. 2 is the only even prime number.
	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		
		int no = s.nextInt();
		boolean prime = true;
		
		if(no==0||no==1)
			{
				System.out.println("Number " + no + " is not a prime no");
			}
		else
		{
			for(int i=2;i<=no/2;i++) //No number is divisible by more than half of itself. So we need to loop through just numberToCheck/2 
			{
				if(no%i==0)
					{
						System.out.println("Number is not Prime: " + no);
						prime = false;
						break;
					}
			
			}
			
			if(prime==true)
			{
				System.out.println("Number is Prime: " + no);
			}
		}

		
}
}