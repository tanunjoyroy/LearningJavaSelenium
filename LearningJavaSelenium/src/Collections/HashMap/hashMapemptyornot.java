package Collections.HashMap;

import java.util.HashMap;

public class hashMapemptyornot {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		System.out.println("Is HashMap Empty? "+hashmap.isEmpty());
		
		hashmap.put(11,"Apple");
	    hashmap.put(22,"Banana");
	    hashmap.put(33,"Mango");
	    hashmap.put(44,"Pear");
	    hashmap.put(55,"PineApple");
	    
	    //to check if a value exist in a hashmap
	    
	    boolean valExist = hashmap.containsValue("Pear");
	    System.out.println(valExist);
	    
	  //to check if a key exist in a hashmap
	    
	    boolean keyExist = hashmap.containsKey(89);
	    System.out.println(keyExist);
	    
	    System.out.println("Is HashMap Empty? "+hashmap.isEmpty());

	}

}
