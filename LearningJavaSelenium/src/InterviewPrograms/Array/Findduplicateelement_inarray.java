//Will work for array with any data type int, string , etc
//hashmap solution is the best approach


package InterviewPrograms.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Findduplicateelement_inarray {

	public static void main(String[] args) {
		
		String name[] = {"c","selenium", "java", "csharp","csharp","java","csharp"};
		
		//1.Compare each element -- O(nxn) time complexity
		//when we use 2 for loops the time complexity is o(nxn)
		//bad algorithm lets assume if we have 1000 of elements in the array then comparison of each element with another will consume more time
		int fr[] = new int [name.length]; 
        int visited = -1; 
		
		
		for(int i=0;i<name.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j])
				{
					count = count + 1;
					fr[j] = visited;  //fr[] = {1,3,1,1,-1,1,-1}// the repeated value indices will be marked as -1 in fr[]
				}
			}
		
			if(fr[i] != visited)  //if the fr[i] is -1 the count wont be stored
                fr[i] = count;   
		
		}
		
		for(int i = 0; i < fr.length; i++){  
            if(fr[i] > 1)  
                System.out.println(" Duplicate found of " + name[i] );  
        }  
		
		
		//2.using hashset -- hashset only stores unique values
		//time complexity is o(n) in interview they would expect this solution
		
		Set<String> names = new HashSet<String>(); //create 1 set object //set is an interface & hashset is a class implemeting the same 
		
		//so a child class object can be reffered by a parent interface reference variable
		
		//if the array elements are int type
		
		//Set<Integer> names = new HashSet<Integer>();
		
		for(String duplicate: name)
		//for(int duplicate: arr) if the array elements are int type
		{
			if(names.add(duplicate) == false) //if an already added value in the array is found then it will return false
				{
					System.out.println("duplicate string found:" +duplicate);
				}

		}
		
		//3.using hashmap [Preferred solution] -- hashmap stores duplicate values so we will use a counter variable to store the no of occurences
		//if no of occurences is >1 its a duplicate
		//maps store values in key,value pair format & the key will store the content while the value will store the no of occurences
		//time complexity O(2n)
		Map<String, Integer> storeMap = new HashMap<String, Integer>(); //create 1 map object //map is an interface & hashmap is a class implemeting the same 
		
		//so a child class object can be reffered by a parent interface reference variable
		
		//if the array elements are int type
		//Map<Integer, Integer> storeMap = new HashMap<Integer, Integer>();
		for(String dup : name)
			//for(int dup : arr) //if the array elements are int type
		{
			Integer count = storeMap.get(dup); //returns the value to which the specified key is mapped, or null if this map contains no mapping for the key
			                               //since storeMap is a new object created currently dup would return null as the value java in array names would not be present
			
			if(count == null) //Primitive types in Java cannot be null so variable count has to be declared as Integer wrapper class object in line 52
			{
				storeMap.put(dup, 1); //1 here is the no of occurence
			}
			else
			{
				storeMap.put(dup, ++count);
			}
			
			
		}
		
		
		for(Map.Entry<String, Integer> m1: storeMap.entrySet())
			//for(Map.Entry<Integer, Integer> m1: storeMap.entrySet()) //if the array elements are int type
		{
			if (m1.getValue()>1)
			{
				System.out.println("the duplicate string is found " +m1.getKey());
				
			}
		

	}
	}
}
