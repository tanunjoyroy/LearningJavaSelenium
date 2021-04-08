package BasicsofJava;

public class TwoDimArray {

	public static void main(String[] args) {
		String S[][]= new String[3][5];
		System.out.println(S.length); //returns the number of rows
		System.out.println(S[0].length); //returns the number of columns
		System.out.println(S[1].length); //since for all rows the no of cols are same you can use the reference of any row number to get the column length

	    S[0][0] = "A";
	    S[0][1] = "B";
	    S[0][2] = "C";
	    S[0][3] = "D";
	    S[0][4] = "E";
	    		
	    S[1][0] = "F";
	    S[1][1]	= "G";
	    S[1][2] = "H";
	    S[1][3] = "I";
	    S[1][4] = "J";
	    		
	    S[2][0] = "K";
	    S[2][1] = "L";
	    S[2][2] = "M";
	    S[2][3] = "N";
        S[2][4]	= "O";
        
        //Print all values of 2-D array
        for(int i=0;i<S.length;i++)
        {
        	for(int j=0;j<S[0].length;j++)
        	{
        		System.out.println(S[i][j]);
        	}
        }
        
        	}
        
	}
	


