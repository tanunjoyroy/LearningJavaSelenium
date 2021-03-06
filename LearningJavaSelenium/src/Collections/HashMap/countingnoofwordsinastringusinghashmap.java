package Collections.HashMap;

import java.util.HashMap;

public class countingnoofwordsinastringusinghashmap {

	public static void main(String[] args) {
		
		String str = "I am a good boy good man I will be Man good";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String[] strArr = str.split(" ");
		
		for(int i=0;i<strArr.length;i++)
		{
			if(hm.containsKey(strArr[i]))
			{
				int count = hm.get(strArr[i]); //to get the current occurrence of a word 
				hm.put(strArr[i], count+1); //remember in hashmap keys cannot be duplicate hence the same key is overwritten while the value is increased by 1
			}
			else
			{
				hm.put(strArr[i], 1); //for first time adding of a word
			}
		}
		
		System.out.println(hm);
		
	}

}
