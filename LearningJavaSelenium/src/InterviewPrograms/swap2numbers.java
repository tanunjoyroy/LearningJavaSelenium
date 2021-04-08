package InterviewPrograms;

import java.util.Scanner;

public class swap2numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
        System.out.println("Enter the first number");
        
        int num1 = sc.nextInt();
        
        Scanner sc1 = new Scanner(System.in);
		  
        System.out.println("Enter the second number");
        
        int num2 = sc1.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("first number is:" + num1);
        System.out.println("second number is:" + num2);

        //using third variable
        int temp;
        temp = num1;
        num1 = num2;//num1 value would be overwritten by num2 value
        num2 = temp;
        
        System.out.println("After swapping:");
        System.out.println("first number is:" + num1);
        System.out.println("second number is:" + num2);
        
        //without using third variable
        //always try to remember this logic by assuming num1=10;num2=20 :
        //1.Our destination is to get num1=20 which means it has to increase i.e +(add) N we are only dealing with 2 nums so num1+num2
        //2.Our destination is to get num2=10 which means it has to decrease i.e -(substract) N to determine the order check the step 1 value i.e num1 is already 30 to get it to 10 we have to substarct by 20 i.e num1-num2
        //3.To get num1=10 use the current value of num1=30 N num2=10
        num1=num1+num2;//30
        num2=num1-num2;//10
        num1=num1-num2;//20
        
        System.out.println("After swapping:");
        System.out.println("first number is:" + num1);
        System.out.println("second number is:" + num2);
        
        
	}

}
