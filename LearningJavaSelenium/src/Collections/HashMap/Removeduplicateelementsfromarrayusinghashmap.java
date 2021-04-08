
//this will work for both sorted & unsorted arrays

package Collections.HashMap;

import java.util.Collection;
import java.util.HashMap;

public class Removeduplicateelementsfromarrayusinghashmap {

	public static void main(String[] args) {
		int arr[] = {10,30,50,10,60,100,30,200,100,10};//{ 1, 2, 5, 1, 7, 2, 4, 2};
		
		//Purpose - Returning the original array with no duplicates
		HashMap<Integer,Boolean> hm = new HashMap<Integer, Boolean>();
		
		for(int i=0;i<arr.length;i++)
		{							 //as we know in hashmaps, keys cannot be duplicate while values can be
			if(hm.get(arr[i])==null) //here in this map,the keys are the numbers so the condition we are checking here is : 
			{						 //lets say we are in the middle of the loop, arr[i]=10 (4th iteration) as we already have 10 in the map because of 1st iteration it will return True hence the condition will fail
									 //will move onto the next iteration now arr[i]=60, this time there is no previous entry of 60 so it will return Null condition will pass hence 60, True will be added in the map
				hm.put(arr[i], true);
				
			}
			
		}
		
		System.out.println(hm);
		
		/*Converting the hashmap to array */
		
		Integer arr1[] = new Integer[hm.size()]; //defining the new array
		Collection<Integer> values = hm.keySet(); //retrieving the numbers from the hashmap
		arr1 = values.toArray(arr1);
		
		System.out.println("Array after removal of duplicates");
		
		for(Integer j=0;j<arr1.length;j++)
		{
			System.out.println(arr1[j]);
		}
	}

}
