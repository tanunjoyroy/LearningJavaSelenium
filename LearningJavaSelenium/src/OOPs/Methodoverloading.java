package OOPs;

public class Methodoverloading {

	public static void main(String[] args) {
		
		Methodoverloading obj1 = new Methodoverloading();
		obj1.sum();
		obj1.sum(1);
		obj1.sum(4, 40);

	}
	
	public void sum() //zero arguments
	{
		System.out.println("0-arg");
	}
	
	public void sum(int i) 
	{
		System.out.println("1-arg");
	}
	
	public void sum(int i,int j)
	{
		System.out.println("2-arg");
	}

}
