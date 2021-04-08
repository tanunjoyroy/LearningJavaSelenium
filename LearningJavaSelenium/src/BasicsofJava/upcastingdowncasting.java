package BasicsofJava;

class Parent
	{
		void show()
		{
			System.out.println("parent's show");
		}
	}
	
class Child extends Parent
	{
		@Override //the below method is overriding parent class's show()
		void show()
		{
			System.out.println("child class's show");
		}
		
		void display()
		{
			System.out.println("child class's unique method");
		}
	}



	public class upcastingdowncasting 
	{
		
		public static void main(String[] args) 
		{
			
			//upcasting - creating a parent class object reference for a child class object
			Parent p1 = new Child(); 
			p1.show(); //using the parentclass type object reference we can only call the overridden parent class method
			           //here dynamic/late/run time binding or polymorphism is happening
			           
			//p1.display();//When we upcast a childclass object, we restrict that object from using child class methods. 
	                      //To use childclass methods, we must downcast the object to childclass object.
			
			//downcasting - When Childclass type object reference refers to the object of Parent class, it is known as downcasting. 
			//If we perform it directly, compiler gives Compilation error.
			//Child c1 = new Parent();
			
			//here child c1 =p1 will throw compile time error because compiler does not know that p1 is referring to child class object so we have to explicitly typecast only then downcasting will work 
			Child c1 = (Child)p1; //we are downcasting p1
			c1.display(); //now using this downcasted object we can access the child class methods
			
			
			

		}

		
		
	}
	

	
	

