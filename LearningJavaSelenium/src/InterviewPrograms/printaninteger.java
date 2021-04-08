package InterviewPrograms;

import java.util.Scanner;

public class printaninteger {

	public static void main(String[] args) {
		//to print an integer entered by an user
		
		Scanner sc = new Scanner(System.in); //System.in(Standard Input) is an InputStream which is typically connected to keyboard input of console programs
		System.out.println("Please enter a number");
		
		int num = sc.nextInt();
		System.out.println("your entered integer is " +num);
		

	}

}
