package InterviewPrograms;

import java.util.Scanner;

public class extractwordsfromasentence {
	
	public static void main(String[] args)
	{
		String sentence = "my name is tanunjoy roy";
		
		String [] words = sentence.split(" ", 5);
		
		for(int i=0;i<words.length;i++)
		{
		System.out.println(words[i]);
		}

}
}


