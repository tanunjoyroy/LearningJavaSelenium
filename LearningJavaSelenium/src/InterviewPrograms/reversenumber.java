package InterviewPrograms;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
	
		//1.Without using in built function
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		
		
		int rev = 0;

		while(num!=0) 
		{ 
		int n = num % 10;
		rev = rev * 10 + n;
		num = num/10;
		
		}

		System.out.println(rev);
		
		//0 at the front wont b considered hence 7800 would b reversed as 87 also 0098 would b reversed as 89

		
		//2.Using in built function
		
		String streqv = String.valueOf(num); //converting int value to string
		
		StringBuffer sr = new StringBuffer(streqv);
		System.out.println(sr.reverse());
	}

}
