package OOPs;

public class Car {
	
	//class vars/Global vars
	 
	int model;
	int wheel;

	public static void main(String[] args) {
		
		
		//interview question below 
		//which is the object in the below syntax
		//new Car() is the object of Car class
		//a,b,c are referencing the objects hence called object reference variables
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		//Copy of both the class variables & global variables will be given to each of the object created
		
		a.model = 2014;
		a.wheel = 4;
		
		b.model = 2015;
		b.wheel = 4;
		
		c.model = 2016;
		c.wheel = 4;
		
		System.out.println(c.model);
		
		System.out.println("after shifting the references");
		
		a=b; //a will now refer to the object pointed by b
		b=c; //b will now refer to the object pointed by c
		c=a; /*c will now refer to the object pointed by a currently i.e the object earlier pointed by b hence a & c will point to the same object 
	         the first object will be having no reference variable*/
		a.model = 10; //value of a.model is changed from 2014 to 10
		System.out.println(a.model); //10
		
		c.model = 20;//value of c.model is changed from 2016 to 20
		System.out.println(a.model);//20 because after reassignment of object references a & c are referring to the same object
		
		
		
	}

}
