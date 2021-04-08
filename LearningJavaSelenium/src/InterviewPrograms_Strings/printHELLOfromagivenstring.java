package InterviewPrograms_Strings;

public class printHELLOfromagivenstring {

	public static void main(String[] args) {
		
		String str = "AHCECLWLXO"; 
		
		
		String outputString = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='H'|str.charAt(i)=='E'|str.charAt(i)=='L'|str.charAt(i)=='L'|str.charAt(i)=='O')
			{
				outputString = outputString + str.charAt(i);
		    }
			

		}
		
		System.out.println(outputString);
		
		//Method 2 [this will only work when the required characters are in alternative positions]
		
		String splitStr[] = str.split("");
		
		for(int i=1;i<splitStr.length;i=i+2)
		{
			System.out.print(splitStr[i]);
		}
		

	}

}
