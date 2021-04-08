package InterviewPrograms;

import java.util.Scanner;

public class checknumberexpressedassumof2primenos {

	public static void main(String[] args) {
		
		//PROGRAM TO CHECK IF A NUMBER CAN BE EXPRESSED AS A SUM OF 2 PRIME NUMBERS
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		boolean flag = false;
		
		//checknumberexpressedassumof2primenos ch = new checknumberexpressedassumof2primenos(); //it would have been required if checkprimeno function would not have been declared as static
		
		for(int i=1;i<=num/2;i++)
		{
			//if(ch.checkprimeno(i)) //it would have been required if checkprimeno function would not have been declared as static
				
			if(checkprimeno(i))
			{
				//if(ch.checkprimeno(num-i)) //it would have been required if checkprimeno function would not have been declared as static
				if(checkprimeno(num-i))      //a number can be a sum of an unique pair 34 = 1+ 33 1 cannot be added with any other number to form 34 other than 33
				{                            //so if a number in the loop is found to be prime(1) it is quite obvious that we have to only check the other unique number(34-1=33) in the pair is prime or not
					System.out.println(num + " = " + i + " + " + (num- i));
					flag = true;
					
				}
			}
			
		}
		
		if(!flag)
		{
			System.out.println(num + " number cannot be expressed as a sum of 2 prime numbers");
		}
		
	}
	


	public static boolean checkprimeno(int n)  //we are declaring it as static so that we dont have to create an object to call this from main ()
		{
			boolean isprime = true;
			
			for(int i=2;i<=n/2;i++)
				{
					if(n%i==0)
					{
						isprime = false;
						break;
					}
				}
			
			return isprime;
		}
}