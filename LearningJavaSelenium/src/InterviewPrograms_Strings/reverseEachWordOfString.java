package InterviewPrograms_Strings;

public class reverseEachWordOfString {

	public static void main(String[] args) {
		
		String str = "I am Tanunjoy";
		
		String words[] = str.split(" ");
		
		String reversedString = "";
		
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String revWord = "";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord = revWord + word.charAt(j);
				
			}
			
			reversedString = reversedString + revWord + " ";
		}
		
		System.out.println("the reversed string is " + reversedString);
	}

}
