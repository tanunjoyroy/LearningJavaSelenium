package OOPs;

public class Wrapperclass {

	public static void main(String[] args) {
		//data conversion
		//String to int
		
		String s = "100";
		System.out.println(s+40); //10040
		
		int i = Integer.parseInt(s);//the converted string to int value will be stored in i
		System.out.println(i+40); //140
		
		System.out.println(s+40);//10040 it is still the same because s & i are independent of each other dont think as S is updated with i value after convertion
		
		//string to double
		
		String A = "44.4";
		System.out.println(A+10);
	
		double d = Double.parseDouble(A);
		System.out.println(d+10);
		
		//string to char -- there is no parsing method for character
		
		//string to boolean
		
		String y = "True";
		boolean l = Boolean.parseBoolean(y);
		System.out.println(l);
		
		//int to string
		
		int b = 100;
		
		System.out.println(i+20);
		
		String k = String.valueOf(b);
		
		System.out.println(k+80);
		
		String w = "100A";
		Integer.parseInt(w); //throw an exception  java.lang.NumberFormatException as the string in question is alphanumeric
		
	}

}
