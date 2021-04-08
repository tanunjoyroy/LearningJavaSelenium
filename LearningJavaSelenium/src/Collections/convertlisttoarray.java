package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class convertlisttoarray {

	public static void main(String[] args) {
		
		//ArrayList or LinkedList can be converted to Array using toArray() method.
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Rohan");
		al.add("Ruhi");
		al.add("Mitra");
		al.add("Tapan");
		
		String[] names = new String[al.size()];
		names = al.toArray(names);
	
		for(String i:names)
		{
			System.out.println(i);
		}
		
		ArrayList<Integer> alNum = new ArrayList<Integer>();
		
		alNum.add(2);
		alNum.add(78);
		alNum.add(98);
		alNum.add(99);
		
		Integer[] num = new Integer[alNum.size()];
		num = alNum.toArray(num);
	
		for(Integer i:num)
		{
			
			System.out.println(i);
		}
		
		
	}

}
