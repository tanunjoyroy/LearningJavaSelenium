package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class removeKeysInHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Tj");
		hm.put(2, "ma");
		hm.put(3, "ravi");
		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(" Key : " + m.getKey() + " Value: " + m.getValue());
		}
		
		//to remove specific key
		
		String removedValue = hm.remove(2); //Removes the mapping for the specified key from this map if present;returns the value associated with removed key, or null if there was no mapping for key
        System.out.println(removedValue);
        
        for(Map.Entry m : hm.entrySet())
		{
			System.out.println(" Key : " + m.getKey() + " Value: " + m.getValue());
		}
        
        //to remove all the key-value mappings
        
        hm.clear();
        
        System.out.println("Hashmap after clearing :" + hm);
	}

}
