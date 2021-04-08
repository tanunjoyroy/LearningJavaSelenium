package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class traversingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(15);
		al.add(45);
		al.add(36);
		
		//size of the array
		System.out.println(al.size());
		
		System.out.println("------");
		
		//using iterator
		
		Iterator<Integer> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------");
		
		//using for each loop
		
		for (Integer n: al)
		{
			System.out.println(n);
		}
		
		System.out.println("------");
		
		//using for loop
		
		for(int i = 0;i< al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("------");
		
		//using while loop
		
		int counter = 0;
		
		while(counter<al.size())
		{
			System.out.println(al.get(counter));
			counter++;
		}
		
		
		

	}

}
