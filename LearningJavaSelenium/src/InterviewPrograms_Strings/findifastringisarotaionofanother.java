package InterviewPrograms_Strings;

public class findifastringisarotaionofanother {

	public static void main(String[] args) {
		
		/*In this program, we need to check whether a string is a rotation of another string or not.

		String 1: abcde  
		String 2: deabc  
		String 1 + String 1: abcdeabcde  

		Consider the above example, suppose we need to check whether string 2 is a rotation of string 1. To find this, we concatenate string 1 with string 1. Then, try to find the string 2 in concatenated string. If string 2 is present in concatenated string then, string 2 is rotation of string 1. String 2 deabc is found on the index 3 in concatenated string. So, deabc is rotation of abcde.*/
		
		String str1 = "abcde", str2 = "deabc";    
        
        if(str1.length() != str2.length()){    
            System.out.println("Second string is not a rotation of first string");    
        }    
        else {    
            //Concatenate str1 with str1 and store it in str1    
            str1 = str1.concat(str1);    
             //Check whether str2 is present in str1    
            if(str1.indexOf(str2) != -1)    
                System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string");    
        }    

	}

}
