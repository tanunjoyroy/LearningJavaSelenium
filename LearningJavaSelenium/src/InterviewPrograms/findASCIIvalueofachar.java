package InterviewPrograms;

import java.util.Scanner;

public class findASCIIvalueofachar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		char ch = sc.next().charAt(0);
		//There is no nextChar() method in java.We need to use the next() method to read a single character as a string & then use charAt(0) to get the first character of that string. 
		System.out.println("the entered character is " + ch);
		
		int Asciinum = ch;
		
		System.out.println("The Ascii number of the character " +ch+ " is " + Asciinum);
		
		
		

	}

}
