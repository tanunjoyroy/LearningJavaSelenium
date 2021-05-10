package InterviewPrograms_Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingCharInStringUsingLinkedHashMap {

	public static void main(String[] args) {
		 //we cannot use hashmap to solve this problem as hashmap does not retain the order of the characters while 
		 //LinkedHashMap holds the data in the same order as that of input string
		//it is the same program as allNonRepeatingCharactersInString except here LinkedHashMap is used & break is used in if condition
		//Note Tree Map holds the data in alphabetically sorted order
		String str = "GeeksforGeeks";
		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		
		char[] charArr = str.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			if(lhm.containsKey(charArr[i]))
				{
					int count = lhm.get(charArr[i]);
					lhm.put(charArr[i],count+1);
							
				}
			else
				{
					lhm.put(charArr[i], 1);
				}
		}
		
		
		
		for(Map.Entry<Character, Integer> lm: lhm.entrySet())
		{
			
			
			if(lm.getValue()==1)
			{
				
				 System.out.println("the first non- repeating character in the string " + str + " is " + lm.getKey());
				 break;
				
			}
		}
		
		
	}


	}


