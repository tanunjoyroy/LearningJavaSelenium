package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class maximumoccurringcharacterinaStringUsingHashMap {

	public static void main(String[] args) {
		
		//String str = "GOD_BLESS_SPIDERMAN";
		String str = "aaaahhhhhhhhhjjjj";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		char[] chrArr = str.toCharArray();
		
		for(int i=0;i<chrArr.length;i++)
		{
			if(hm.containsKey(chrArr[i]))
			{
				int count = hm.get(chrArr[i]);
				hm.put(chrArr[i], count + 1);
			}
			else
			{
				hm.put(chrArr[i], 1);
			}
		}
		
		int maxVal = 0;
		char maxKey = ' ';
		
		for(Map.Entry<Character, Integer> m: hm.entrySet())
		{
			if(m.getValue()>maxVal)
			{
				maxKey = m.getKey();
				maxVal = m.getValue();
			}
			
		}
		
		System.out.println("The maximum occuring character is " + maxKey + " of times " + maxVal);
		
		
	}

}
