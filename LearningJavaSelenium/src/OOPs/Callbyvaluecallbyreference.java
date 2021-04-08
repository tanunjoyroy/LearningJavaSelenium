package OOPs;

public class Callbyvaluecallbyreference {
	
	 int p = 50;
	 int q = 90;

	public static void main(String[] args) {
		
		int x = 40;
		int y = 60;
		Callbyvaluecallbyreference obj = new Callbyvaluecallbyreference();
		//In call by value or pass by value
		//copy of the values is sent hence if we change the values inside the function sum() it wont affect the values of x & y
		obj.sum(x, y);
		System.out.println(x+y);//100
		
		//call in reference is possible in java by passing object references
		
		obj.swap(obj);
		

	}

	public int sum(int a,int b)
	{
		a = 50;
		b = 80;
		int z = a+b;
		System.out.println(z);//when calling sum function it would send 40 & 60 but it would take the latest values in sum function
		return z;
	}
	
	public void swap(Callbyvaluecallbyreference t) //in memory now t = obj
	{
		int temp;
		temp = t.p;
		t.p=t.q;
		t.q=temp;
		
		System.out.println(p);
		System.out.println(q);
		
		
	}
}


