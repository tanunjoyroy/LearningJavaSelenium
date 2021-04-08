package OOPsAdvanced;

public class Testbank {

	public static void main(String[] args) {
		//USBank c = new USBank(); not possible because creation of object of interfaces are not possible
		Hdfcbank h = new Hdfcbank();
		//compile time polymorphism
		h.credit();
		h.debit();
		h.carloan();
		h.eduloan();
		h.moneytransfer();
		
		//dynamic polymorphism
		//child class object can be referred by a parent interface reference variable
		USBank u =new Hdfcbank();
		u.credit();
		u.debit();
		u.moneytransfer();
		
		System.out.println(USBank.min_bal); //call by interface name
		//USBank.min_bal = 200; //The final field USBank.min_bal cannot be assigned
		
		

	}

}
