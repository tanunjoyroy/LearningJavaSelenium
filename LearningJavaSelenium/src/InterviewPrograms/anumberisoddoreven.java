package InterviewPrograms;

import java.util.Scanner;

public class anumberisoddoreven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
        System.out.println("Enter the number");
        
        int num1 = sc.nextInt();
        
        if(num1%2==0)
        {
        	System.out.println("number " + num1 + " is an even number");
        	
        }
        else
        {
        	System.out.println("number " + num1 + " is an odd number");
        }
        

	}

}
