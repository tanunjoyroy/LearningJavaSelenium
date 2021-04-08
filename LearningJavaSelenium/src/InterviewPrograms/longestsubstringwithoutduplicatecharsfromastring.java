package InterviewPrograms;

public class longestsubstringwithoutduplicatecharsfromastring {

	public static void main(String[] args) {
		// Write a Java program to find the longest substring from a given string which doesn’t contain any duplicate characters
		
		String word = "tomato";
		String wordLowcase = word.toLowerCase(); //it is case sensitive
		String substring = "";
		
		
		
		for(int i=0;i<wordLowcase.length();i++)
		{
			for(int j=i+1;j<wordLowcase.length();j++)
			{
				if(wordLowcase.charAt(i)==wordLowcase.charAt(j))
				{
					
					substring = wordLowcase.substring(0, j);
				    
				}
				
			}
			
		}
		System.out.println(substring);
	}

}
