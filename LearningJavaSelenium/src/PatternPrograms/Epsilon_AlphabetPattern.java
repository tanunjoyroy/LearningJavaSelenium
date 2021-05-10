/*
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 


A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 


*/

package PatternPrograms;

public class Epsilon_AlphabetPattern {

	public static void main(String[] args) {
		int alphabet = 65;

        for (int i = 0; i <= 5; i++)

        {

        	for (int j = 0; j <= i; j++)

        	{

        		System.out.print((char)(alphabet + i) + " "); //1st output
        		//System.out.print((char) (alphabet + j) + " "); //2nd output

        	}

        
        System.out.println();

        }
        
        //Note if lower case letters are asked then int alphabet = 97;
        //A-Z 65 to 90 a-z 97 to 122 

	}

}
