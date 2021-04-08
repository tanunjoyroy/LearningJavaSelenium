package InterviewPrograms;

public class removewhitespaceswithoutusingreplacemethod {

	public static void main(String[] args) {
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
	       //String str2 = new String(); the reason why we cannot use a String object instead StringBuffer is because String class do not have append() method also it has concat(String) which means it takes String args not char args
			StringBuffer str2 = new StringBuffer();
			char CharArr[] = str1.toCharArray();
			
			for(int i=0;i< CharArr.length;i++) //length is not a method but final variable
			{
				if(CharArr[i]!=' ')
				{
					str2.append(CharArr[i]);
				}
				
				
			}
			
			System.out.println("The string without blank spaces "+ str2);
			

	}
}



//using replace()
	//String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
	//String str2 = str1.replace(" ", "");
	//System.out.println(str2);

