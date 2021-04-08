package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrListDescOrder {

	public static void main(String[] args) {
		//Sorting a list of integers in descending order
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(30);
		arrList.add(40);
		arrList.add(78);
		arrList.add(40);
		arrList.add(11);
		arrList.add(68);
		arrList.add(88);
		
		System.out.println(arrList);
		
		Collections.sort(arrList,Collections.reverseOrder()); //descending order
		
		System.out.println(arrList);
		
		//Sorting a list of strings in descending order
		
		
		
				ArrayList<String> countries = new ArrayList<String>();
				
				countries.add("India");
				countries.add("Zimbabwe");
				countries.add("China");
				countries.add("Indonesia");
				countries.add("Iceland");
				
				
				System.out.println(countries);
				
				Collections.sort(countries,Collections.reverseOrder()); 
				
				System.out.println(countries);
		
	}

}
