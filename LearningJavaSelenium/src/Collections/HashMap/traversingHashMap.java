package Collections.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class traversingHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		
		//to store values
		m.put(1, "Cricket");
		m.put(2, "football");
		m.put(3, "hockey");
		m.put(4, "tennis");
		
		//to read the values 
		System.out.println(m.get(2));
		System.out.println(m.get(5)); //it will print null & not any exception error because it does not store the value on the basis of indexes--
		
		
		
		//code to iterate hashmap
		
		//Method1
		
		//hashmap.entrySet() - It basically returns a set having same elements as the hash map.  
		
		//-Why do we use HashMap.entrySet()?

		//-Since Map doesn't extend Collection Interface, it does not have its own iterator. Hence we use HashMap.entrySet() to return a set having the same elements as that in hash map so that Iterator can be used since Set extends Collection interface.
		
		//Map.Entry interface in Java provides certain methods to access the entry in the Map. By gaining access to the entry of the Map we can easily manipulate them.
		//The Map.Entry interface enables you to work with a map entry.
        //The entrySet( ) method declared by the Map interface returns a Set containing the map entries. Each of these set elements is a Map.Entry object.
	     for(Map.Entry m1:m.entrySet())
	     {
	    	 System.out.println(m1.getKey() +" "+m1.getValue());
	     }
	
	     System.out.println(m); //to print hashmap object
	     m.remove(3);//to remove key from hashmap
	     System.out.println(m); //after removal, key '4's value is not moved to key '3' because hashmap does not maintain order
	     
	     //storing java objects in hashmap 	
	     
	     //Method2: iterator: over the keys: by using KeySet()
	     
	     Iterator<Integer> it = m.keySet().iterator(); //remember iterator() we have to apply on the keyset not the map
	     
	     while(it.hasNext())
	     {
	    	 Integer Key = it.next();
	    	 String value = m.get(Key);
	    	 System.out.println(value);
	     
	     }
	     System.out.println("-----");
	     //Method3 : iterator: over the pairs of key,value: by using entryset
	     
	     Iterator<Entry<Integer, String>> it1 = m.entrySet().iterator(); //remember iterator() we have to apply on the entryset not the map//it returns iterator for the entire set of key,value pairs 
	     //set is internally stored with the help of entry class Type
	     
	     while(it1.hasNext())
	     {
	    	 Entry<Integer, String> entrySet = it1.next();//it will return set of entries
	    	 System.out.println("Key : " + entrySet.getKey() + " Value " + entrySet.getValue());
	     }
	     
	     //Method4 : iterate hashmap using Java 8 for each & lambda
	     m.forEach((k,v) -> System.out.println("key = " + k + " and value = " + v));
	
	}
	
	
	

}
