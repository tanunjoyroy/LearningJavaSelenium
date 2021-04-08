package OOPsAdvanced;

public class Car extends Vehicle //Parent class/Super class of BMW class

{
	public void start() //overridden method
	{
		System.out.println("car--start");
	}
	
	public void stop()
	{
		System.out.println("car--stop");
	}
	
	public void refuel()
	{
		System.out.println("car-refuel");
	}
}
