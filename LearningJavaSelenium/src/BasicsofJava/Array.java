package BasicsofJava;

public class Array {

	public static void main(String[] args) {
		
		//integer array
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		//important interview question
		//what will happen if we try to fetch
		//System.out.println(i[4]);
		//we will get java.lang.ArrayIndexOutOfBoundsException
		
		//to get the length of the array
		System.out.println(i.length);
		
		//to print all the values of array
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		double d[]=new double[2];
		char c[]=new char[2];
		boolean b[]=new boolean[2];
		String s[]=new String[2];
		
		s[0] = "Hello";
		s[1] = "World";
		
		System.out.println(s.length);
		
		//Object is a superclass (class of all the classes)
		//Object array - to store different data type values in a single array
		
		Object ob[]=new Object[4];
		ob[0]="Rohan";
		ob[1]=28;
		ob[2]='M';
		ob[3]=true;
		
		System.out.println(ob.length);
				
		
	}

}
