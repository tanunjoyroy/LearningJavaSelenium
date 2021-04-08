package TestNGSession;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class dependsonMethodsfeature {
	//in real time if we cannot log in to an application then there is no point in executing the homepagetest which means homepage depends on loginpage
	@Test()
	public void loginTest()
	{
		System.out.println("logintest");
		int i =9/0; //causing an exception so that logintest fails
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest()
	{
		System.out.println("homePagetest");
	}

	@Test(dependsOnMethods = "loginTest")
	public void searchPageTest()
	{
		System.out.println("searchPagetest");
	}

}
