package InterviewPrograms_Strings;

public class lengthOfAstringWithoutUsinglengthmethod {

	public static void main(String[] args) {
		
		//to find out length of a string without using length() method
		String str = "Testing";
		
		//Solution 1
		System.out.println(str.toCharArray().length); //here length is a variable on the chararray to get the array size
		
		//Solution 2
		System.out.println(str.lastIndexOf(""));
		
		//Solution 3
		System.out.println(str.split("").length); //here length is a variable on the string array returned by split to get the array size
		
		//Solution 4
		int count=0;
		for(char c : str.toCharArray())
		{
			count++;
		}
		
		System.out.println(count);

	}

}
