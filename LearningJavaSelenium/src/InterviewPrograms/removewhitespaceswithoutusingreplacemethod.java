package InterviewPrograms;

public class removewhitespaceswithoutusingreplacemethod {

	public static void main(String[] args) {
		String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
	       //String str2 = new String(); the reason why we cannot use a String object instead StringBuffer is used because String class do not have append() method also it has concat(String) which means it takes String args not char args
			StringBuffer str2 = new StringBuffer();
			
			
			for(int i=0;i< str1.length();i++) 
			{
				if(str1.charAt(i)!=' ')
				{
					str2.append(str1.charAt(i));
				}
				
				
			}
			
			System.out.println("The string without blank spaces "+ str2);
			

	}
}



//using replace()
	//String str1 = "Saket Saurav        is an Autom ation Engi ne      er";
	//String str2 = str1.replace(" ", "");
	//System.out.println(str2);

