package InterviewPrograms;

import java.util.Scanner;

public class computeqoutientremainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  
        System.out.println("Enter the dividend");
        
        int dividend = sc.nextInt();
        
        Scanner sc1 = new Scanner(System.in);
		  
        System.out.println("Enter the divisor");
        
        int divisor = sc1.nextInt();
        
        System.out.println("the remainder is :" + (dividend%divisor));
        System.out.println("the qoutient is :" + (dividend/divisor));
	}

}
