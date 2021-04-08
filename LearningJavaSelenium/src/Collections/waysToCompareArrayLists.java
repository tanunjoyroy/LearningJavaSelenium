package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class waysToCompareArrayLists {

	public static void main(String[] args) {
		
		//1.sort and then equals
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("B","A","D","E","C"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","C","D","B","E"));
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l1.equals(l2)); //false
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1);
		System.out.println(l2);
		
		System.out.println(l1.equals(l2)); //true //1-1 element equality check is done which means the order of the same element in both the lists has to be same
		
		//2.finding out the additional element present in an arraylist against another using removeall() method
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","D","E","F"));
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","C","D","B","E"));
		
		l3.removeAll(l4); //Removes from this list (l3) all of its elements that are contained in the specified collection (l4).Hence the remaining element in l3 would be the additional element
		System.out.println(l3); //[F]
		
		//3.finding out the missing element in l3
		
		l4.removeAll(l3);
		System.out.println(l4); //[C]
		
		//4.finding the common elements between 2 arraylists
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("B","A","D","E","F"));
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A","C","D","B","E"));
		
		l5.retainAll(l6); //Retains only the elements in the list(l5) that are contained in the specified collection (l6). 
		
		System.out.println(l5);
		
		
		
		
		
		
		
		

	}

}
