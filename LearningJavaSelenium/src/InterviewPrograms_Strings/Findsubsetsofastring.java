package InterviewPrograms_Strings;

public class Findsubsetsofastring {

	public static void main(String[] args) {
		String str = "FUN";
		
		int len = str.length();
		
		//Total possible subsets for string of size n is n*(n+1)/2  
		int subsetCnt = len*(len +1)/2;
		
		int temp = 0;
		
		String subset[] = new String[subsetCnt];
		
		//F,U,N,FU,UN,FUN
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				String subsets = str.substring(i,j+1); //substring(beginindex,endindex); beginindex - inclusive endindex - exclusive
				subset[temp] = subsets;
				temp++;
				
				
			}
		}
		
		for(int k=0;k<subset.length;k++)
		{
			System.out.println("The possible subsets of string " + str + " are " + subset[k]);
		}
		

	}

}
