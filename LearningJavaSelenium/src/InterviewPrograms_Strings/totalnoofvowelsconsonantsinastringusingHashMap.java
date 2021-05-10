package InterviewPrograms_Strings;

import java.util.HashMap;
import java.util.Map;


public class totalnoofvowelsconsonantsinastringusingHashMap {

	public static void main(String[] args) {
		String str1 = "This is a really simple sentence";
		int countV = 0;
		int countC = 0;
		
		//Converting entire string to lower case to reduce the comparisons i.e. skipping [A,E,I,O,U] comparisons
		str1=str1.toLowerCase().replaceAll(" ", "");
		
		System.out.println(str1);
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		int count = 0;
		
		
		for(int j=0;j<str1.length();j++)
		{
			if(!hm.containsKey(str1.charAt(j)))
			{
				hm.put(str1.charAt(j), 1);
			}
			else
			{
				count = hm.get(str1.charAt(j));
				hm.put(str1.charAt(j), count);
			}
		}
		
		for(Map.Entry<Character,Integer> m: hm.entrySet())
		{
			if(m.getKey()=='a'||m.getKey()=='e'||m.getKey()=='i'||m.getKey()=='o'||m.getKey()=='u')
			{
				countV++;
			}
			else
			{
				countC++;
			}
		}
		
		System.out.println("The total number of vowels in the string are "+ countV);
		System.out.println("The total number of consonants in the string are "+ countC);
		

	}

}
