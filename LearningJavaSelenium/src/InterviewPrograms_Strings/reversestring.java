package InterviewPrograms_Strings;

public class reversestring {

	public static void main(String[] args) {
		
		String t = "I am tanunjoy";
		
		//1.Using for loop
		
		
		int s = t.length();
		
		String rev = "";
		
		for(int i=s-1;i>=0;i--)
		{
			
			rev = rev + t.charAt(i);
		}

		System.out.println(rev);
		
		//2.
		//Interview Q 
		//q-Reverse a string using a default function
		//s-not possible since string class do not have in built reverse function because string is an immutable & final object.
		//Hence we have to use StringBuffer--It is mutable object hence we have a reverse function
		
		StringBuffer sf = new StringBuffer(t);
		System.out.println(sf.reverse());
		
	}

}
