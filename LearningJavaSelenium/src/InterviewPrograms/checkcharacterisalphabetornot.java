package InterviewPrograms;

import java.util.Scanner;

public class checkcharacterisalphabetornot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character");
		
		char ch = sc.next().charAt(0);
		
		//In Java, char variable stores the ASCII value of a character (number between 0 and 127) rather than the character itself.
		if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z'))
		{
			System.out.println(ch + " character is an alphabet");
		}
		else
		{
			System.out.println(ch + " character is not an alphabet");
		}

	}

}
