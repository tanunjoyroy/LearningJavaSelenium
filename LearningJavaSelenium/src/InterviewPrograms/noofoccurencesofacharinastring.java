package InterviewPrograms;

import java.util.Scanner;

public class noofoccurencesofacharinastring {

	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int wordcount=0;
		
		for(char ch='a';ch<='z';ch++)
		{
			for(int i=0;i<str.length();i++)
			{
				if(ch==str.charAt(i)) 
				{
					wordcount++;
				}
				
				
			}
			
			System.out.println(" occurence of char "+ ch + " in string " + str + " is :" + wordcount);
			wordcount = 0;
		}
		

	}

}

