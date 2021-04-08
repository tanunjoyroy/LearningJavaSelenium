package InterviewPrograms;

import java.util.Scanner;

public class displayprimenosbetween2intervals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower limit");
		
		int lowlim = sc.nextInt();
		
		System.out.println("Enter the upper limit");
		
		int upplim = sc.nextInt();
		
		
		int i = lowlim;
		boolean prime = true;
		
		//for(int i = lowlim;i<=upplim;i++) 
		while(i<=upplim)
		{
			for(int x=2;x<=i/2;x++) 
			{	
				if(i%x==0) 
					{
						prime = false;
						break;
					
					}
				
				 
			}
			
			if(prime)//false
			{
				System.out.print("the prime nos between " + lowlim + " & " + upplim + " are " + i + ",");
			}
			
			i++;
			prime = true;
			
		}
		

		
		

}
}
//