package TestNGSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleTest {
	
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

	@Test(priority=1) //if priority not defined then execution would be based on the alphabet of the function name
	public void googleTitleTest()
	{
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2)
	public void googleLogoTest()
	{
		boolean prsence = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(prsence);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
