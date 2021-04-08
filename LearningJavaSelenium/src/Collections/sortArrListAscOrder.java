package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class sortArrListAscOrder {

	public static void main(String[] args) {
		
		//Ascending order can also be called as Natural ordering/sorting of elements in interview
		
		//Sorting a list of integers in ascending order
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(18);
		al.add(45);
		al.add(34);
		
		//we can add an element in array list at a specific index
		
		al.add(2, 64);
		
		iteratelist(al);
		
		Collections.sort(al); //ascending order
		
		System.out.println("After sorting");
		
		iteratelist(al);
		
		//Sorting a list of strings in ascending order
		
		ArrayList<String> countries = new ArrayList<String>();
		
		countries.add("India");
		countries.add("Zimbabwe");
		countries.add("China");
		countries.add("Indonesia");
		countries.add("Iceland");
		
		
		iteratelist(countries);
		
		Collections.sort(countries); //ascending order
		
		System.out.println("After sorting");
		
		iteratelist(countries);
	}

	/*public static void iteratestringlist(ArrayList<String> countries) {
		for(String temp:countries)
		{
			System.out.println(temp);
		}
	}

	public static void iterateintegerlist(ArrayList<Integer> al) {
		for(Integer temp:al)
		{
			System.out.println(temp);
		}
	}*/
	
	public static <T> void iteratelist(ArrayList<T> anylist) {
		for(T temp:anylist)
		{
			System.out.println(temp);
		}
	}

}

//check .txt file for explanation for understanding
