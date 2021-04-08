package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;

public class sortlistofstringsusingcollection {

	public static void main(String[] args) {
		
		String list [] = {"jan","Feb","aug","sept","nov","DEC"};
		
		//java.util.Arrays-This class contains various methods for manipulating arrays (such assorting and searching).

		Arrays.sort(list); //ascending order
		Arrays.sort(list, Collections.reverseOrder()); //descending order
		
		
		//System.out.println(list);//Not possible - You cannot print array elements directly in Java, you need to use Arrays.toString() or Arrays.deepToString() to print array elements. Use toString() if you want to print one-dimensional array and use deepToString() method if you want to print two-dimensional array
		// Collections.sort() works for objects Collections like ArrayList, LinkedList, etc.
		
		System.out.println("Printing in ascending order :" + Arrays.toString(list));
		System.out.println("Printing in descending order :" + Arrays.toString(list));
		
	}

}
