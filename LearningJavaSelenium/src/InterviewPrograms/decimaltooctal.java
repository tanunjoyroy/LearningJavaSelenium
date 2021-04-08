package InterviewPrograms;

import java.util.Scanner;

public class decimaltooctal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the decimal number");
		
		int decimalnumber = sc.nextInt();
		
		int octalnumber[] = new int[10];
		
		
		int i=0;
		
		while(decimalnumber!=0)
			{
				octalnumber[i] = decimalnumber%8;
				decimalnumber=decimalnumber/8;
				i++;
			}
		
		for(int j = i-1;j>=0;j--)
			{
				System.out.print(octalnumber[j]);
			}

	}

}
