package InterviewPrograms;

import java.util.Scanner;

public class programtoconvertdecimaltobinary {

	public static void main(String[] args) {
		
		//156 base 10 = divide the number by 2 gather all the remainders from the bottom = 10011100 base 2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a decimal number");
		
		int decimalnumber = sc.nextInt();
		
		long binarynumber[] = new long[100];
		int i=0;
		
		
		while(decimalnumber!=0)
			{
				binarynumber[i] = decimalnumber%2; 
				decimalnumber = decimalnumber/2;
				i++;
				
			}
		for(int j=i-1;j>=0;j--)
			{
				System.out.print(binarynumber[j]);
			}
	
		
	}
	
	

}

