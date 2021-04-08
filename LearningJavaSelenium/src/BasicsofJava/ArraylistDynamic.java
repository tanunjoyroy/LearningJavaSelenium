package BasicsofJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDynamic {

	public static <E> void main(String[] args) {
		
		///in static array we define the type & size in the beginning while in dynamic we can add any time acc to our need
		
		ArrayList a = new ArrayList();
		a.add(100); //index is optional by default based on its position in the code the index is specified in the array
		a.add(200);
		
		System.out.println(a.size()); //2
		
		a.add(500);
		a.add(800);
		a.add(900);
		
		System.out.println(a.size()); //5
		
		//it can store values of any type
		a.add(50.5);
		
		a.add("Hello");
		
		a.add('G');
		
		a.add(65.5);
		
		System.out.println("before removal :" +a.size());
		
		a.remove(8); // it will remove the value at position 8
		
		System.out.println("after removal :" +a.size());
		
		//to get any element in any position
		
		System.out.println(a.get(3)); //800
		//System.out.println(a.get(5)); //throws indexoutofboundexception
		
		//to print all the values in arraylist
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
			
		// to restrict the type of values to a single type in arraylist
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		//ar1.add("My Team");//string value not allowed
		
		//if we are not sure of the type of data to be inserted in the array
		ArrayList<E> ar5 = new ArrayList<E>();
		
		//we can also store different class objects(here students) or user defined objects in an array list
		Students s1=new Students("ravi",89,90);
		Students s2=new Students("kumar",45,96);
		
		ArrayList<Students> ar6 = new ArrayList<Students>();
		ar6.add(s1);
		ar6.add(s2);
		
		//iterator present in java collection framework is used to traverse the values of an array list when the values are of class object type
		
		Iterator<Students> itr = ar6.iterator();
		while(itr.hasNext())
		{
			Students st = itr.next(); //itr.next() will return the first element which is an object of student typ hence the variable is declared as student typ to store the value
	        System.out.println(st.name);	
	        System.out.println(st.age);
	        System.out.println(st.marks);
		}
		
		//addall() - to merge two array lists
		System.out.println("-----");
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("rambo");
		ar7.add("taylor");
		ar7.add("ronty");
		
		

		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("gitartha");
		ar8.add("amlan");
		ar8.add("rahuljit");
		
		ar8.addAll(ar7); //will append all the ar7 elements into ar8 array list; works vice versa as well
		for(int i=0;i<ar8.size();i++)
		{
			System.out.println(ar8.get(i));
		}
		
		System.out.println("----");
		//removeall()
		ar8.removeAll(ar7); //this will remove all ar7 elements from ar8 array list
		for(int i=0;i<ar8.size();i++)
		{
			System.out.println(ar8.get(i));
		}
		
		System.out.println("---");
		
		//retainall() only the common value is retained
		
		ArrayList<String> ar9= new ArrayList<String>();
		ar9.add("rambo");
		ar9.add("taylor");
		ar9.add("ronty");
		
		

		ArrayList<String> ar10= new ArrayList<String>();
		ar10.add("gitartha");
		ar10.add("taylor");
		ar10.add("rahuljit");
		
		ar10.retainAll(ar9); //works both ways ar9.retainAll(ar10)
		for(int i=0;i<ar10.size();i++)
		{
			System.out.println(ar10.get(i));
		}
	}

}
