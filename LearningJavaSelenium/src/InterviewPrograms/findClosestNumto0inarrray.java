package InterviewPrograms;

public class findClosestNumto0inarrray {
	
	static int getClosestToZero(int[] array) {
		
	    int num = array[0];
	
	    int absNum = Math.abs(num); 
	
	    for(int i = 1; i < array.length; ++i) { 
	
	        int newAbs = Math.abs(array[i]);
	
	        if(newAbs < absNum) { 
	
	            absNum = newAbs; 
	
	            num = array[i]; 
	
	        }
	
	    }
	
	    return num;

	}


	public static void main(String[] args) {
		
		int[] myArray = {-5, -2, -3, -1, 0};
	
		System.out.println(getClosestToZero(myArray));
		
	}

}
