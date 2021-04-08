package BasicsofJava;

public class LearnConstructor {
	
	String name; //String name = "ravi" when you want the value to be same throughout the program
	int age;
	//constructor overloading
	public LearnConstructor() //0 param constructor
	{  
		System.out.println("default constructor");
	}
	public LearnConstructor(int i) //1 param constructor
	{  
		System.out.println("1 param constructor");
	}
	public LearnConstructor(int i, int j) //2 params constructor
	{  
		System.out.println("2 params constructor");
	}
	public LearnConstructor(String name, int age) //here name & age are local variables and not the same as class variables declared above
	{
		//when the line 35&36 execute it would pass values to the local variables name & age but we have to initialize the class variables
		//this keyword is used to pass the value of local variables to class variables
		this.name = name; //this.classvariable = local variable
		this.age = age;
		//note - if different variable names are used for class & local then this not required
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {
		
		//constructors are executed everytime a new object is created
		LearnConstructor obj = new LearnConstructor();
		LearnConstructor obj1 = new LearnConstructor(10);
		LearnConstructor obj2 = new LearnConstructor(10,20);
		
		//constructors are also used to initialize class/global variables
		//in real time we can use constructors to intialize class variables when the values would be dynamic for each object and not constant(when static it can be directly assigned while declaration above)
        
		LearnConstructor obj3 = new LearnConstructor("Steve", 30);
		LearnConstructor obj4 = new LearnConstructor("Virat", 34);
		
		//printing the class variables
		System.out.println(obj3.age);
		System.out.println(obj3.name);
		System.out.println(obj4.age);
		System.out.println(obj4.name);
		
	}
	
	

}
