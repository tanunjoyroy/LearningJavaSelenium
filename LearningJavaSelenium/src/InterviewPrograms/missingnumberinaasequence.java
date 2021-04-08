package InterviewPrograms;

public class missingnumberinaasequence {

	public static void main(String[] args) {
		int a[]= {-1,1,2,3,4,5,6,7,8,9,10,11}; 
		//this logic will work only 
		//in list of numbers in sequence which means it would still work in an unsorted sequence {-1,10,11,3,2,7,8,0,5,7,6,4} 
		//but it wont work in {-1,5,2,9,40} there are multiple missing numbers
		//will work in any sorted sequence {55,56,57,58,60}
		//will not work in finding more than 1 number missing in a sequence ("findmultiplemissingnos")
		
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}

		System.out.println(sum);
		
		int sum1=0;
		for(int j=-1;j<=11;j++)
		{
			sum1 = sum1 + j;
		}
	
		System.out.println(sum1);
		
		System.out.println("missing number:"+(sum1-sum));
		
	}
	

}
