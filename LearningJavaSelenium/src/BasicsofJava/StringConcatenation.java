package BasicsofJava;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// "+" is concatenation operator
		int a = 100;
		int b = 200;;

		String x = "Hello";
		String y = "World";

		System.out.println(a+b); // 300
		System.out.println(x+y); //HelloWorld

		//Calculated always from left to right
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a is:"+a);
		System.out.println("the addition of a N b is:"+(a+b));
		
		System.out.print("hello testing ");
		System.out.println("hello selenium");

	}

}
