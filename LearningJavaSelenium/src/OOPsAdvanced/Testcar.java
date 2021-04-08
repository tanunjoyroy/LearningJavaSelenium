package OOPsAdvanced;

public class Testcar {

	public static void main(String[] args) {
		
		//creating an object of BMW class as it defined as public N can be accessed from any class;always create objects of child class
		//polymorphism - using the inherited method (here start()) to perform different task (for BMW child class). This allows us to perform single action in different ways
		//static/compile-time polymorphism
		BMW b = new BMW();
		b.start(); //Preference is given to the method of the child class when executing
		b.stop();
		b.refuel();
		b.threatsafety();
		b.engine();
		//accessing vehicle class method as car class extends from vehicle 
		
		System.out.println("******"); //to differentiate the outputs
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Car c1=new BMW(); //child class object can be referred by parent class reference variable -- dynamic polymorphism/run time polymorphism //this is also called upcasting
		c1.start(); //for common methods When an overridden method is called through a reference of parent class, then type of the object determines which method is to be executed(preference given to the method of child class)
		c1.stop();
		c1.refuel();
		//c1.threatsafety(); //not possible only common methods and parent class methods can be accessed by dynamic polymorphism
	
	    //down casting
		BMW b2=(BMW)new Car(); //down casting syntax
		//down casting is not possible in this concept;ClasscastException
	
	}
	
	

}
