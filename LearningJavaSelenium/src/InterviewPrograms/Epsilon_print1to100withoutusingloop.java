package InterviewPrograms;

import java.util.stream.IntStream;

public class Epsilon_print1to100withoutusingloop {

	public static void main(String[] args) {
		
	//Method 1 using recursive function
		printNum(1);
		printNum(5,50);
	//Method 2 Using Java Streams introduced in Java 8
		IntStream.range(1, 101).forEach(e -> System.out.println(e));

	}
	
	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	//if we do not want to hard code the number we can generalize the function
	
	public static void printNum(int strNum, int endNum)
	{
		if(strNum<=endNum)
		{
			System.out.println(strNum);
			strNum++;
			printNum(strNum,endNum);
		}
	}
	
	
	
	

}
