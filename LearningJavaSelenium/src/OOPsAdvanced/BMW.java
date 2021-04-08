package OOPsAdvanced;

public class BMW extends Car{
	
	//interview question -- when same method is present in parent class as well as in child class with the same name and same number of arguments, 
	//is called method overriding
	
	//here the start() method is present in both parent car() class & child BMW() class
	//Preference is given to the method of the child class when executing
	
	public void start() //overriding method
	{
	  System.out.println("BMW--Start");
	}
	
	public void threatsafety()
	{
		System.out.println("BMW--Threatsafety");
	}
	

}
