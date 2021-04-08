//constructor chaining

package BasicsofJava;

public class demoParent {

	demoParent()  
	{  
	this(80, 90);  
	System.out.println("Base class default constructor called");  
	}  
	//base class parameterized constructor  
	demoParent(int x, int y)  
	{  
	System.out.println("Base class parameterized constructor called");  
	}  

	

}
