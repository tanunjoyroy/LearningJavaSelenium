package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicateEle_ArrayList_LinkedHashSet {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(4,6,2,4,7,9,6,4,9,1,9,6,0,3,6));
		//utility-instead of using add method multiple times, adding different elements in one go
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		//passing the arraylist in the constructor of linkedhashset which would return a linkedhashset with no duplicate values and with the insertion order maintained
		
		ArrayList<Integer> numbersListWithNoDup = new ArrayList<Integer>(linkedHashSet);
		//passing the resultant linkedhashset in the constructor of ArrayList
		
		System.out.println(numbersListWithNoDup);
		

	}

}
