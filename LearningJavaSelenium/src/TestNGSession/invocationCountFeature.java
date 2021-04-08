package TestNGSession;

import org.testng.annotations.Test;

public class invocationCountFeature {

	//if we want to execute the same function multiple times
	@Test(invocationCount = 10)
	public void homePageTest()
	{
		System.out.println("homePagetest");
	}

}
