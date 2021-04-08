package OOPs;

public class Staticvsnonstatic {

	String name = "Jai";
	static int age = 40;
	
	public static void main(String[] args) {
		
		//Calling static method
		//1.Directly
		
		staticmethod();
		
		//2.By class name
		Staticvsnonstatic.staticmethod();
		
		//Calling static variable
		//1.Directly
		System.out.println(age);
		
		//2.By class name
		System.out.println(Staticvsnonstatic.age);
		
		//Calling non static method
		//1.By creating object of the class
		Staticvsnonstatic obj = new Staticvsnonstatic();
		obj.nonstaticmethod();
		
		//Calling non static variable
		//1.By creating object of the class
		System.out.println(obj.name);
		
		//interview q can we use the object to access static methods & variables ? Yes but we will get a warning as it is not the correct practice
		
		obj.staticmethod();
		System.out.println(obj.age);
		
		
		

	}

	public static void staticmethod() {
		System.out.println("static method");
	}
	
	public void nonstaticmethod()
	{
		System.out.println("non static method");
	}
}
