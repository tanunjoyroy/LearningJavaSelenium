package InterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class findduplicatecharfromstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String word = sc.nextLine();
		
		char[] chrarr = word.toCharArray(); //you can also convert the string to a character array & traverse through the array & compare each element in solution 1
		
		//1.
		System.out.println("Duplicate Characters in above string are: ");
		
		//for(int i=0;i<chrarr.length;i++)
		for(int i=0;i<word.length();i++)
			{
				for(int j=i+1;j<word.length();j++)
					//for(int j=i+1;j<chrarr.length;j++)
					{
						if(word.charAt(i)==word.charAt(j))
						//if(chrarr[i]==chrarr[j])
							
							{
								System.out.println(word.charAt(i) + " ");
								break;
							}
					}
			}
		
		//2. using hashset
		
		Set<Character> dupchars = new HashSet<Character>();
		
		for(Character ch: chrarr)
			{
				if(dupchars.add(ch)==false)
					{
						System.out.println("duplicate character found " + ch);
					}
			}
		

		//3. using hashmap [Preferred solution] In a seperate file under collections folder findduplicatecharsinastringusinghashmap
		
		}
}
