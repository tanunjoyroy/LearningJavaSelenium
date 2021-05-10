package InterviewPrograms_Strings;

public class extractNumbersFromStringReturnSum {

	public static void main(String[] args) {
		
		//String str = " abababbaba56-7 babbaba ba&98   ";
		String str = "23+4";
		//String str = "gdjkjhlkajflk";
		//String str = "ab5c2d4ef12s";
		
		str = str.replaceAll("[^0-9]", " "); //to remove all the characters other than numbers
		
		str = str.trim(); //to remove all the leading & trailing spaces
		
		str = str.replaceAll(" ", ""); //to remove the spaces in between
		
		System.out.println(str);
		
		int sum = 0;
		
		for(int i=0;i<str.length();i++)
		{
			//if(Character.isDigit(str.charAt(i)))
			//{
				int a = Integer.parseInt(String.valueOf(str.charAt(i))); 
				//String.valueOf(char c) - Returns the string representation of the char argument.
				//Integer.parseInt(String s) - Returns the int representation of the string argument.
				sum = sum + a;
				
			//}
			
			
		}
		
		if(sum==0)
		{
			System.out.println("there are no digits in the string");
		}
		else
		{
			System.out.println("the sum of the digits in the string are " + sum);
		}
		
		
	}

}
