package InterviewPrograms;

import java.util.Scanner;

public class displayarmstrongnobetween2intervals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower limit");
		
		int lowlim = sc.nextInt();
		
		System.out.println("Enter the upper limit");
		
		int upplim = sc.nextInt();
		
		
		
		while(lowlim<=upplim)
		{
			int sum = 0;
			
			int n = lowlim;
			
			while(n!=0)
				{
					int dig = n%10;
					sum = sum + dig*dig*dig;
					n = n/10;
				
				}
			
			if(lowlim==sum)
				{
				
					System.out.println("the armstrong number are " + lowlim + " " );
				}
			
			lowlim++;
			
			
		}

	}

}
