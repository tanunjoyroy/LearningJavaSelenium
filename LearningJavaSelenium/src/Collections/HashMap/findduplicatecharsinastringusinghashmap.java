package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class findduplicatecharsinastringusinghashmap {

	public static void main(String[] args) {
		
String str = "am a good oya good man I will be Man good";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		char[] charArr = str.toCharArray();
		
		System.out.println(charArr.length);
		
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
		
		for(Map.Entry<Character,Integer> m:hm.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println("The duplicate character is found "+ m.getKey() + ":" +m.getValue());
			}
		}
		
		
		


	}

}
