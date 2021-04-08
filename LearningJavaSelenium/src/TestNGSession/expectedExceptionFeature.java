package TestNGSession;

import org.testng.annotations.Test;

public class expectedExceptionFeature {
	
	//if want to ignore the exception & pass the test
	//interview q in testNG is there any other alternate method to handle exceptions besides catch try block
	//without the parameter the below test would fail
	@Test(expectedExceptions=NumberFormatException.class)
	public void test()
	{
		String x = "100A";
		Integer.parseInt(x);
	}

}
