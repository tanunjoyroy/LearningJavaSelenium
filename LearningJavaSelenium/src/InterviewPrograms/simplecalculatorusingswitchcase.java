package InterviewPrograms;

import java.util.Scanner;

public class simplecalculatorusingswitchcase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input the type of operation");
		
		char operation = sc.next().charAt(0);
		
		System.out.println("Enter the first number");
		
		double num1 = sc.nextDouble(); //using double to handle both integers & decimal values
		
		System.out.println("Enter the second number");
		
		double num2 = sc.nextDouble();
		
		
		switch (operation)
		{
		case '+':
			System.out.println(num1+num2);
			break;
		
		case '-':
			System.out.println(num1-num2);
			break;
			
		case '*':
			System.out.println(num1*num2);
			break;
			
		case '/':
			System.out.println(num1/num2);
			break;
			
		case '%':
			System.out.println(num1%num2);	
			break;
			
		default:
			System.out.println("not valid operation type");
		}
		
	}

}
