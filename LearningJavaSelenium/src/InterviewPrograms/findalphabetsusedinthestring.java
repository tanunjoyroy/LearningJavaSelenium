package InterviewPrograms;

import java.util.Scanner;

//this program is used to find which all alphabets from [A-Z] are used in string
public class findalphabetsusedinthestring {

	public static void main(String[] args) {
		
		String word;
		int count = 0;
		
		
		System.out.println("Enter string");
		
		Scanner sc = new Scanner(System.in);
		
		word = sc.nextLine();
		word = word.toUpperCase();
		
		System.out.println("Following characters are used in the input text:");
	      for (char ch = 'A'; ch <= 'Z'; ch++ ) {
	            
	          for (int i = 0; i < word.length(); i++ ) {
	              if ( ch == word.charAt(i) ) {
	                  System.out.print(ch + " ");
	                  count++;
	                  break;
	              }
	          }
	      }
	       
	      System.out.println("\nTotal number of characters are: " + count);
	    
	   }
	    
	
	}


