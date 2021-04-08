package OOPs;

public class Methods {

	public static void main(String[] args) {
		
		Methods obj = new Methods();
		
		//one object will be created, obj is the reference variable , referring to this object
		//after creating the object,the copy of all non static methods will be given to this object
		
		obj.test();
		
		int c =obj.pqr();
		System.out.println(c);
		
		String q=obj.qa();
		System.out.println(q);
		
		int d=obj.division(50, 5);
		System.out.println(d);
		
		
	}

	// Non static methods
	public void test() {
		System.out.println("test method");
		}
	
	public int pqr() {
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		}
	
	public String qa() {
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
		
		
	}
	
	public int division(int x,int y)
	{
		
		int d = x/y;
		return d;
	}
	}

