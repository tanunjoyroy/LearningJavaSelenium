package InterviewPrograms;

import java.util.Scanner;

public class sumofnaturalnos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		
		//for loop
		int sum = 0;
		
		for(int x=1;x<=n;x++)
		{
			sum = sum+x;
		}
	
		System.out.println("the sum of " + n + " natural nos is " + sum );
		
		System.out.println("------");
		
		//while loop
		int y=1;
		int sum1 =0;
		while(y<=n) {
			
			sum1 = sum1+y;
			y++;
		}
		System.out.println("the sum of " + n + " natural nos is " + sum1 );
		
		System.out.println("------");
		
		//do-while loop
		int sum2=0;
		int z =1;
		
		do
		{
			sum2 = sum2 + z;
			z++;
		}while(z<=n);
		System.out.println("the sum of " + n + " natural nos is " + sum2 );
		
		
	}

}
