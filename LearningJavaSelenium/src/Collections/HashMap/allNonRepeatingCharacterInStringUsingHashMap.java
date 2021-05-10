package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class allNonRepeatingCharacterInStringUsingHashMap {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		char[] charArr = str.toCharArray();
		
		for(int i=0;i<charArr.length;i++)
		{
			if(hm.containsKey(charArr[i]))
				{
					int count = hm.get(charArr[i]);
					hm.put(charArr[i],count+1);
							
				}
			else
				{
					hm.put(charArr[i], 1);
				}
		}
		
		System.out.println("all the non- repeating character in the string " + str + " are ");
		
		for(Map.Entry<Character, Integer> m: hm.entrySet())
		{
			
			
			if(m.getValue()==1)
			{
				
				 System.out.println(m.getKey());
				
			}
		}
		
		
	}

}
