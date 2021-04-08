package InterviewPrograms;

import java.util.Scanner;

public class totalnoofwordsinastring {

	public static void main(String[] args) {
		
		String word;
		int wordcount = 0;
		
		System.out.println("Enter string");
		
		Scanner sc = new Scanner(System.in);
		
		word = sc.nextLine();
		
		for(int i = 0;i< word.length()-1;i++)
		{
			if(word.charAt(i)==' ' && word.charAt(i+1)!=' ')
			{
				wordcount = wordcount + 1;
			}
			
		}
		
		System.out.println("Total no of words :"+ wordcount+1);

	}

}
