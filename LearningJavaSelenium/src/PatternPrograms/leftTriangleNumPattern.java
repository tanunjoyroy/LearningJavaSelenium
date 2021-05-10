/*1 
  1 2 
  1 2 3 
  1 2 3 4 
  1 2 3 4 5*/


package PatternPrograms;

public class leftTriangleNumPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) //outer loop represents the no of rows 
		{
           for(int j=1;j<=i;j++) //inner loop represents the number to be printed
           {
        	   System.out.print(j + " ");
           }
           
           System.out.println();
			
	    }

}
}
