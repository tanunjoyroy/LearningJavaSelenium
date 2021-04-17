package InterviewPrograms_Strings;

import java.util.Arrays;

public class convertanarrayofStringsinasingleString {

	//The toString() method of the Arrays class accepts a String array (in fact any array) and returns it as a String
	/*Arrays.toString() method is used to return a string representation of the contents of the specified array. 
	 * The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). 
	 * Adjacent elements are separated by the characters “, ” (a comma followed by a space). It returns “null” if the array is null.
	 */
	public static void main(String[] args) {
		
		String strArr[] = {"How ","are ","you ","sehwag "};
		
		int intArr[] = {10,40,30,56,24};
		
		String players = Arrays.toString(strArr);
		
		String numbers = Arrays.toString(intArr);
		
		System.out.println(players);
		
		System.out.println(numbers);
		
		//But we need the output in a single string so we need to use stringbuffer
		
		StringBuffer sb =new StringBuffer();
		
		for(int i=0;i<intArr.length;i++)
		{
			sb.append(intArr[i]);
		}
		
		String singleStr = sb.toString();
		System.out.println(singleStr);
		
		StringBuffer sb1 =new StringBuffer();
		
		for(int j=0;j<strArr.length;j++)
		{
			sb1.append(strArr[j]);
		}
		
		String singleStr1 = sb1.toString();
		System.out.println(singleStr1);


	}

}
