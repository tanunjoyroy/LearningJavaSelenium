package InterviewPrograms;

public class multiply2floatingptnos {

	public static void main(String[] args) {
		
		float a = 4.590f; 
		float b = 6.898f;
		//When representing a float data type in Java, we should append the letter f to the end of the data type; otherwise it will save as double.
		//floating pt nos precision upto 6 or 7 decimals; double nos precision up to 15 or 16 decimals.
		//floating pt var can also store integers eg. float v = 2f;
		System.out.println("multiplication of 2 floating nos is : " + (a*b));

	}

}
