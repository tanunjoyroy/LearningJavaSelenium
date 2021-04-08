package InterviewPrograms;

import java.util.Scanner;

public class identifydigitsfromthestring {

	public static void main(String[] args) {
		
		String alphanumerical;
		String digits;
		
		System.out.println("Enter the alphanumeric value");
		Scanner sc = new Scanner(System.in);
		
		alphanumerical = sc.nextLine();
		
		digits = alphanumerical.replaceAll("[^0-9]", "");
		
		System.out.println("the digits in the alphanumeric string are:" +digits);
		
	}

}
