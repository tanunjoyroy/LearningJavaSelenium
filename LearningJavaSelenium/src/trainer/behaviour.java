package trainer;

import animal.tiger;

public class behaviour {

	public static void main(String[] args) {
		
		tiger t = new tiger();
		t.sound(); //compile error as sound() is protected & available in different package

	}

}
