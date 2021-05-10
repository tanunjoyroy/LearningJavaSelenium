package InterviewPrograms_Strings;

public class reverseAstringWordByWord {
	
	//Input string may contain leading or trailing spaces.However reversed string should not contain leading or trailing spaces String str = "the sky is blue"; String str = "  hello  world!   ";
	//You need to reduce multiple spaces between 2 words to a single space in the reversed string String str = "a good     example"

	public static void main(String[] args) {
		
		//diff ex.
		//String str = "the sky is blue";
		//String str = "  hello  world!   ";
		String str = "a good     example";
		
		int i = str.length()-1; //starting i from the end
		
		String revStr = "";
		
		while( i >= 0) //loop will run till i does not reach the starting character of the first word 'T'
		{
			while( i >=0 && str.charAt(i) == ' ')
				i--; //it will by pass the spaces at the end & put i pointer at the last alphabet character of last word 'e' in iteration 1
			
			int j = i; //declaring j to store the current i value 'e' which the last character index in iteration 1
			
			while( i >=0 && str.charAt(i) != ' ') //this will run till the i reaches the space before the first character 'B' of the last word  & stop as it fails condition in iteration 1
				i--; //so now i is at the index of space before the first character of the last word & j is at the last character of the last word in iteration 1
			
			//Now to extract the word we will use substring function
			
			revStr = revStr + str.substring(i+1, j+1) + " ";
			
			
		}
		
		System.out.println(revStr);
		

	}

}
