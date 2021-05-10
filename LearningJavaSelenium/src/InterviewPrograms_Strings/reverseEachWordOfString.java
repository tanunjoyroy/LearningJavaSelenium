package InterviewPrograms_Strings;

public class reverseEachWordOfString {

	public static void main(String[] args) {
		
		String str = "I am tanunjoy";
		
		String words[] = str.split(" ");
		
		String reversedString = "";
		
		for(int i=0;i<words.length;i++)
		{
			
			String revWord = "";
			
			for(int j=words[i].length()-1;j>=0;j--)
			{
				revWord = revWord + words[i].charAt(j);
				
			}
			
			reversedString = reversedString + revWord + " ";
		}
		
		System.out.println("the reversed string is " + reversedString);
	}

}
