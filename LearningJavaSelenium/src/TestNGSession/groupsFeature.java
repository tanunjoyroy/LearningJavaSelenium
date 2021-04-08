package TestNGSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groupsFeature {
	
WebDriver driver; //declaring it here so that it can be used throughout the program
	
	@BeforeMethod
	public void setUp() //all the pre-requisite steps should be defined here
	{
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Naveen Automation\\Latest chrome driver version 79\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@Test(priority=1,groups="titletest") //adding groups feature; in the html report we can see the results group wise; 
	                                     //in real time we can group the test based on pages lets say 50 tests belong to search page & 10 tests belong to homepage then 1 groups="homepage" & other groups="search page"
	public void googleTitleTest()
	{
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2,groups="logotest")
	public void googleLogoTest()
	{
		boolean prsence = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(prsence);
	}
	
	@Test(priority=3,groups="test")
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority=4,groups="test")
	public void test2()
	{
		System.out.println("test2");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}



