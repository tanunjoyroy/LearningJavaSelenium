package BasicsofJava;

import java.util.Hashtable;

public class hashtabledynarr {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		//the key,value combination data type can be of any same or different type 
		h.put(1, 100);
		h.put(2, 500);
		h.put(3, "Computer");
		
		System.out.println(h.size());
		
		h.put("laptop", 500);
		h.put('a',"tablet");
		
		System.out.println(h.size());
		
		System.out.println(h.get('a'));
		
		//to restrict type of key & value
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(8, 1000);
		//h1.put('t', "text"); //not allowed
		
		Hashtable<Double,String> h2 = new Hashtable<Double,String>();
		h2.put(56.5,"sachin");
		//h2.put(90,"obama"); //not allowed
		
	}

}
