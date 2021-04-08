package InterviewPrograms;

import java.util.Scanner;

public class lastindexofanycharinstring {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(str.lastIndexOf('a'));
		
		//it is counted from 0 to n-1

	}

}
