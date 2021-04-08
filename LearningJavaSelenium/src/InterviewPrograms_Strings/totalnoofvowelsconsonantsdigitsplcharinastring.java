package InterviewPrograms_Strings;

public class totalnoofvowelsconsonantsdigitsplcharinastring {

	public static void main(String[] args) {
		String str1 = "This is a really simple sentence1278 &*45";
		int countV = 0;
		int countC = 0;
		int countDig = 0;
		int countSplChar = 0; //space will be counted as special characters
		
		//Converting entire string to lower case to reduce the comparisons i.e. skipping [A,E,I,O,U] comparisons
		str1=str1.toLowerCase();
		
		for(int i=0;i<str1.length();i++)
		{
			//if((str1.charAt(i)>='a' && str1.charAt(i) <= 'z') || (str1.charAt(i)>='A' && str1.charAt(i) <= 'Z'))
			//as we converted the string to lower case only lower case condtn
			if((str1.charAt(i)>='a' && str1.charAt(i) <= 'z')) 
			
				if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u')
					countV++;
				else
					countC++;
			
			else if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
			{
				countDig++;
			}
			else
				countSplChar++;
		
				
		}
		
		System.out.println("The total number of vowels in the string are "+ countV);
		System.out.println("The total number of consonants in the string are "+ countC);
		System.out.println("The total number of digits in the string are "+ countDig);
		System.out.println("The total number of special characters in the string are "+ countSplChar);
		

	}

}
