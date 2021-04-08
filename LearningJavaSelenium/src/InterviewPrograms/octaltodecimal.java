package InterviewPrograms;

import java.util.Scanner;

public class octaltodecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the octal number");
		
		int octalnumber = sc.nextInt();
		
		int decimalnumber =0;
		
		int remainder,i=0;
		
		while(octalnumber!=0)
			{
				remainder = octalnumber%10;
				decimalnumber += remainder * Math.pow(8, i);
				i++;
				octalnumber=octalnumber/10;
			}
		
		System.out.println(decimalnumber);


	}

}
