package InterviewPrograms_Strings;

import java.util.Arrays;

public class checkanagram {

	public static void main(String[] args) {
		
		String string1 = "Tanunjoyroy";
		String string2 = "nuntaoyj yor";
		
		
		String s1 = string1.replaceAll(" ", ""); //str1 = str1.replaceAll("\\s+", ""); will also work
		// \\s+ is a regex which means matches sequence of one or more whitespace characters
		//String s1 = string1.trim(); //cannot use trim() because trim removes only leading & trailing whitespaces
		String s2 = string2.replaceAll(" ", "");
		
		if(s1.length()!=s2.length())
			{
				System.out.println("Strings are not anagram");
			}
		else
			{
				char s1arr[] = s1.toLowerCase().toCharArray();
				char s2arr[] = s2.toLowerCase().toCharArray();
				Arrays.sort(s1arr);
				Arrays.sort(s2arr);
				
				boolean isAnagram = Arrays.equals(s1arr, s2arr);
				
				if(isAnagram)
				
					System.out.println("Strings are anagram " + string1 +"," + string2);
				
				else
					System.out.println("Strings are not anagram "+ string1 +"," + string2);
				
				
			}
		
		
		

	}

}
