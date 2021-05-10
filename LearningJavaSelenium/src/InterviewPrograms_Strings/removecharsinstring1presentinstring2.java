package InterviewPrograms_Strings;

import java.util.Arrays;

public class removecharsinstring1presentinstring2 {
	
	/*1.Algo - We will define an integer count array of the max size of an ASCII Character set which is 256 so that all possible characters are covered
	       - ASCII value of A to z is 65-90;a to z is 97-122
	       - this count array will have all the entries as 0 except for the character values present in second string will be 1 
	       - in our eg. string 2 world which means index 87,100,108,111,114 will have value as 1
	       - loop through the first string character by character to check the count of a particular character in count array;it will obviously be 0 for the unique characters in string 1 but 1 for the common ones
	       - common ones will be skipped & not added to the resultant array
	       - program link https://www.youtube.com/watch?v=uv_zvJozvuU */

    //this logic is working only for first = main second = ice ; some issue with arr[ri] = '\0'; commented in the video(link abv) awaiting youtubers reply
	static final int NO_OF_ASCII_CHARS = 256;
	
	static int[] getSecondStrCount(String str)
	{
		int count[] = new int[NO_OF_ASCII_CHARS];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		return count;
		
	}
	
	static String removeChars(String first, String second)
	{
		int count[] = getSecondStrCount(second);
		
		char firstStrArr[] = first.toCharArray();
		
		int resultantArrInd = 0;
		
		for(int k=0;k<firstStrArr.length;k++)
		{
			if(count[firstStrArr[k]]!=1) //when count[firstStrArr[k]]=0 retain the character
			{
				firstStrArr[resultantArrInd] = firstStrArr[k];
				resultantArrInd++;
			}
		}
		firstStrArr[resultantArrInd] = '\0'; //to terminate the extra garbage characters which will be left over at the end in the resultant array by null
        
		int fi = 0, ri = 0;
		char arr [] = first.toCharArray();
		
		while(fi != arr.length)
		{
			char fstrchar = arr[fi];
			if(count[fstrchar] == 0)
			{
				arr[ri] = arr[fi];
				ri++;
			}
			fi++;
		}
		
		arr[ri] = '\0';
		
		return new String(arr);
	}
	
	
	public static void main(String[] args) {
		
		String str1 = "rahul";
		String str2 = "raj";
		
		System.out.println(removeChars(str1, str2));
	}
}
	
	//2.Below logic only works if both the string are of same length
	/*public static void main(String[] args) {
		
		String str1 = "mainstream";
		String str2 = "icecreamam";
		
		
		
		char[] ss1 = str1.toCharArray();
        char[] ss2 = str2.toCharArray();

        for(int i=0;i<ss1.length;i++){
          for(int j=0;j<ss2.length;j++){
                if(ss1[j] == ss2[i]){
                    ss1[j] = ' '; //Replace the common char with space
                }
            }
         }
        
        
        
        StringBuffer sb = new StringBuffer();
        for(int k = 0;k<ss1.length;k++)
        {
        	sb.append(ss1[k]);
        }
        
        String finFirstStr = sb.toString().replaceAll(" ", "");
        System.out.println(finFirstStr);
    }
		
		

	}*/


