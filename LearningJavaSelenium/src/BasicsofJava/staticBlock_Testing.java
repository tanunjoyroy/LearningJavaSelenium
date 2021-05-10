package BasicsofJava;

public class staticBlock_Testing {

	public static void main(String[] args) {
		
		//2.But what if we want to initialize an object of this class created outside the class in staticBlock_Testing class?
		//staticBlock_Interview_Question stBlock = new staticBlock_Interview_Question(); 
		//we get an error "The constructor staticBlock_Interview_Question() is not visible" as it is private
		
		/*There are 2 solutions to this
		
		/i.Create a static block in staticBlock_Interview_Question class inside which create an object of staticBlock_Interview_Question.It will be created as soon as staticBlock_Interview_Question 
		   class is loaded & as the staticBlock_Interview_Question() constructor now is within scope of the class no err will be thrown & the object 'staticage1' will be initialized with 30.But we have to make sure that
		   that the object is made global to be accessed outside the block*/
		
		   System.out.println(staticBlock_Interview_Question.staticage1.age);
		
		//ii.Create a static method createObject() in staticBlock_Interview_Question class inside which create an object & initialize it.Call this method in staticBlock_Testing class.*/
		 
		 int age = staticBlock_Interview_Question.createObject();
		 
		 System.out.println(age);
		
		
		

	}

}
