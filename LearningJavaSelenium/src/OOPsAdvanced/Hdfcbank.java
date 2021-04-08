package OOPsAdvanced;

public class Hdfcbank implements USBank,Brazilbank // we are achieving multiple inheritance by implementing 2 parent interfaces this is also called is-a relationship
{   

	
		//overriding from USBank
		public void credit()
		{
		 System.out.println("credit-hsbc");
		}
		public void debit()
		{
			System.out.println("debit-hsbc");
		}
		public void moneytransfer()
		{
			System.out.println("moneytransfer-hsbc");
		}
		//own method
		public void eduloan()
		{
			System.out.println("edu loan");
		}
		public void carloan()
		{
			System.out.println("car loan");
		}
		//overriding from Brazilbank
		public void mutualfund()
		{
			System.out.println("hsbc--mutualfund");
		}
		
	}


