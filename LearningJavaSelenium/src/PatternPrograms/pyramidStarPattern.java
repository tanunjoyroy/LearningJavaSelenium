/*  
    * 
   * * 
  * * * 
 * * * * 
* * * * *
 */
package PatternPrograms;

public class pyramidStarPattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for (int j=5-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			
			for (int j=1; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            }
			
			System.out.println(); 
		}

	}

}

//pending https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/ last program
//https://www.programiz.com/java-programming/examples/pyramid-pattern
//https://www.techcrashcourse.com/2016/04/java-program-to-print-triangle-star-pattern.html
