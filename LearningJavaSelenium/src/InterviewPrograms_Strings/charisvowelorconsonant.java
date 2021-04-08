package InterviewPrograms_Strings;

import java.util.Scanner;

public class charisvowelorconsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
        System.out.println("Enter the character");
        
        char ch = sc.next().charAt(0);
        
        //1.using if statement
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
        	System.out.println("character "+ ch +" is a vowel");
        }
        else
        {
        	System.out.println("character "+ ch +" is a consonant");
        }

        //2.using switch statement
        switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':	
            System.out.println(ch + " is vowel");
            break;
        default:
        	System.out.println(ch + " is consonant");
        	
	}
        
}}

//Method 3 using indexOf()

/*class Vowels
{
        // function to check if the passed  
        // character is a vovel
    public static boolean vowel(char c)
    {
        return "aeiouAEIOU".indexOf(c)>=0;
    }
 
        // Driver program
    public static void main(String[] args) 
    {
        boolean isVowel = vowel('a');
         
                // Printing the output
                if(isVowel)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
*/
