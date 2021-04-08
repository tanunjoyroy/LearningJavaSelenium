//program to find total no of chars in a string excluding white spaces

package InterviewPrograms;

public class findtotalnoofcharsinstring {

	public static void main(String[] args) {
		String str1 = "The best of both worlds";
		int count = 0;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) != ' ')
			{
				count=count+1;
			}
		}
		
		System.out.println("The total number of characters excluding whitespaces in the string are "+ count);
		

	}

}
