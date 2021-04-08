package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Countingnoofcharsinastringusinghashmap {

	public static void main(String[] args) {
		
		String str = "I am a good boy good man I will be Man good";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
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
		
		System.out.println(hm);
		
	
	}

}
