package InterviewPrograms_Strings;

import java.util.LinkedHashMap;

public class longestsubstringwithoutduplicatecharsfromastringusinglinkedhashmap {

	public static void main(String[] args) {
		// Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters
		
		//String str = "javaconceptoftheday";
		//String str = "Tomato";
		//String str = "thelongestsubstring";
		String str = "Java";
		//String str = "nagmani";
		//Convert inputString to charArray
        
        char[] charArray = str.toLowerCase().toCharArray();
         
        //Initialization
         
        String longestSubstring = null;
         
        int longestSubstringLength = 0;
         
        //Creating LinkedHashMap with characters as keys and their position as values.
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        //Iterating through charArray
         
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];
         
            //If ch is not present in charPosMap, adding ch into charPosMap along with its position
             
            if(!charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }
             
            //If ch is already present in charPosMap, repositioning the cursor i to the position of ch and clearing the charPosMap
             
            else
            {   
                i = charPosMap.get(ch); 
                 
                charPosMap.clear(); //map is cleared so that the below if condition fails & longestSubstring, longestSubstringLength does not get updated when a duplicate character is encountered
            }
             
            //Updating longestSubstring and longestSubstringLength
             
            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                 
                longestSubstring = charPosMap.keySet().toString();
            }
        }
         
        System.out.println("Input String : "+str);
         
        System.out.println("The longest substring : "+longestSubstring);
         
        System.out.println("The longest Substring Length : "+longestSubstringLength);
    }
		
}
