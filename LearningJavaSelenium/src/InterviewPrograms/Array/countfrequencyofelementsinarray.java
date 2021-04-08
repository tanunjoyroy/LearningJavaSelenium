package InterviewPrograms.Array;

public class countfrequencyofelementsinarray {

	public static void main(String[] args) {
		int arr1[] = {23,45,67,89,45,98,45};
		//Array fr will store frequencies of element  
        int fr[] = new int [arr1.length]; 
        int visited = -1; 
		
		
		for(int i=0;i<arr1.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					count = count + 1;
					fr[j] = visited;  //fr[] = {1,3,1,1,-1,1,-1}// the repeated value indices will be marked as -1 in fr[]
				}
			}
		
			if(fr[i] != visited)  //if the fr[i] is -1 the count wont be stored
                fr[i] = count;   
		
		}
		
		System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr1[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  

        for(int i = 0; i < fr.length; i++){  
            if(fr[i] > 1)  
                System.out.println(" Duplicate found of " + arr1[i] );  
        }  
	}

}
