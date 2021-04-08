package InterviewPrograms;

import java.util.Scanner;

public class factorsofanumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no");
		
		int no = sc.nextInt();
		
		//the factors of a number are the numbers which can perfectly divide the given number
		//eg. 60 can be divided by 1,2,3,4,5,6,10,12,15,20,30,60 so these r the factors
		
		for(int i=1;i<=no;i++)
			{
				int x = no%i;
				
				if(x==0)
					{
						System.out.println("the factors of " + no + " are " + i);
					}
			}

	}

}
