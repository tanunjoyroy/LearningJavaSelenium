package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterduplicateelementsinanarraylistusingstreams {

	public static void main(String[] args) {
		// After JDK8 we have the concept of streams
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(4,6,2,4,7,9,6,4,9,1,9,6,0,3,6));
		List<Integer> numbersList = numbers.stream().distinct().collect(Collectors.toList()); //returns the final list without any duplicate elements
        System.out.println(numbersList);
        
        //stream() is always applied on an arraylist
	}

}
