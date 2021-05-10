package BasicsofJava;

public class staticBlock_Interview_Question {
	
	//How can we create objects if we make constructor private?
	
	//1.objects can be created & initialized using the private constructor within the class as private's scope is always within the class
	
	static staticBlock_Interview_Question staticage1; //declare a static variable of class type in the class level so that it can be accessed anywhere
	
	static
	{
		staticage1 = new staticBlock_Interview_Question(); //or staticBlock_Interview_Question.staticage1 = new staticBlock_Interview_Question();
		//scope of static block members is only within the block so we have to make it global(ln 9) in order to access it outside the block
		//Refer D:\Study\Naveen Automation\Java\Explanation of object creation.txt
	}
	
	public static int createObject()
	{
		staticBlock_Interview_Question obj2 = new staticBlock_Interview_Question();
		obj2.age = 40;
		return obj2.age;
	}
	
	//For eg.1 Line 26 to 38
	int age;
	
	private staticBlock_Interview_Question()
	{
		age = 30;
	}

	public static void main(String[] args) {
		
		staticBlock_Interview_Question staticage = new staticBlock_Interview_Question();
		System.out.println(staticage.age);//30 //This is for eg.1
		
	}
	
	
	
	//2.But what if we want to create an object of this class outside the class in staticBlock_Testing class?
	//check staticBlock_Testing class

}
