//constructor chaining

package BasicsofJava;

public class demoChild extends demoParent {

	
		
		//derived class default constructor  
		demoChild()  
		{  
		this("Java", "Python");  
		System.out.println("Derived class default constructor called");  
		}  
		//derived class parameterized constructor  
		demoChild(String str1, String str2)  
		{  
		  super(10,20);
		  System.out.println("Derived class parameterized constructor called");  
		}  
		  
	
		
		
		//main method  
		public static void main(String args[])   
		{   
		//initializes the instance of example class  
			demoChild my_example = new demoChild();  
		}   
		
	

}
