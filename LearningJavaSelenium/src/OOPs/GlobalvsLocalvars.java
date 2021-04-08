package OOPs;

public class GlobalvsLocalvars {
	
	//class/global variables
	String name = "Raj";
	int age = 20;

	public static void main(String[] args) {
		
		int i = 15;
		
		System.out.println("value of local variable of main is" + i);
		
		//accessing global var
		GlobalvsLocalvars obj = new GlobalvsLocalvars();
		System.out.println(obj.name);

		System.out.println(obj.age);
		
		obj.sum();
	}
	
	public void sum()
	{
		int i = 48;
		
		System.out.println("value of local variable of sum is"+i);
		
		//accessing global var
		System.out.println(name);
		System.out.println(age);
	}

}
