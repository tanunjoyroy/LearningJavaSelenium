package InterviewPrograms_Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class removeduplicatecharactersinStringUsingLinkedHashMap {

	public static void main(String[] args) {
		 //String str = "SILLYSPIDERS";
		String str = "JAVA";
		 //output SILYPDER, JAV the second or further occurence of the character should be removed //LinkedHashMap is used as it holds the data in the same sequence in the string
		
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
		
		String res = " ";
		
		for(Map.Entry<Character, Integer> lm: lhm.entrySet())
		{
			
			res = res + lm.getKey();
			
		}
		
		System.out.println("The resultant string after removing duplicates is " + res);
		

	}

}
