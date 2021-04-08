package InterviewPrograms_Strings;

public class uprchartolowerviceversaina_string {

	public static void main(String[] args) {
		
		String str = "aBCdgHyjjKkIo";
		
		StringBuffer strNew = new StringBuffer(str);
		
		//isLowerCase(char ch),isUpperCase(char ch) method is a part of Character class
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				strNew.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				strNew.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
			
		}
		
		System.out.println("String after case conversion : " + strNew);  
		
		

	}

}
