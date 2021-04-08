package TestNGSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assertioninTestNG {
	
WebDriver driver; 
	
	@BeforeMethod
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Naveen Automation\\Latest chrome driver version 79\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}

	@Test
	public void googleTitleTest()
	{
		
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123","title does not match"); //the message will only print if the validation fails
		
	}
	
	@Test
	public void googleLogoTest()
	{
		boolean prsence = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		System.out.println(prsence);
		
		Assert.assertTrue(prsence); //assertEquals can also be used
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}



