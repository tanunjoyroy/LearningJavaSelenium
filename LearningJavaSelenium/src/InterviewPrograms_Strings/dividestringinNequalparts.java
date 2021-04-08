package InterviewPrograms_Strings;

public class dividestringinNequalparts {

	public static void main(String[] args) {
		String str ="My name is Tanunjoy ";
		
		int len = str.length();
		
		int n = 4;
		
		//to store the parts of string
		String[] equalStr = new String [n];  
		
		int parts = len/n;
		
		int temp = 0;
		
		if(len%n!=0)
		{
			System.out.println("String "+ str + "cannot be divided into "+ n +"equal parts");
		}
		else
		{
			for(int i = 0; i < len; i = i+parts) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+parts);  
                equalStr[temp] = part;  
                temp++;  
        }  
			
			System.out.println(n + " equal parts of given string are ");
			
            for(int i = 0; i < equalStr.length; i++) { 
            	  System.out.println(equalStr[i]);  
            }
            	
		}
		


	}

}
