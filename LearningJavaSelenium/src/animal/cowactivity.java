package animal;

public class cowactivity {

	public static void main(String[] args) {
		
		cow c = new cow();
		c.sound(); //compile error as the sound() is declared as private
		c.breed = "bullock"; //compile error as the breed is declared as private
	}

}
