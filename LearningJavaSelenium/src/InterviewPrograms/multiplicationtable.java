package InterviewPrograms;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		System.out.println("table of " + n );
		
		for(int x=1;x<=10;x++)
		{
			int mul = n * x;
			
			System.out.println(+ n + "*" + x + "=" + mul);
		}

	}

}
