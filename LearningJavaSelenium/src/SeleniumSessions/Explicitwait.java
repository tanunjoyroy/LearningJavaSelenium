package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		clickon(driver,driver.findElement(By.xpath("//input[@value='Log In']")),10);
		selecton(driver,driver.findElement(By.xpath("//select[@name='birthday_month']")),10);
		 
	    
		

	}

	
	//always construct separate functions to handle explicit wait to call anytime before any element in main()
	
	
	
	  public static void clickon(WebDriver driver,WebElement locator, int timeout) //for buttons,links,checkbox,radiobuttons 
	  { 
	  WebDriverWait wait = new
	  WebDriverWait(driver,timeout);
	  wait.until(ExpectedConditions.elementToBeClickable(locator));
	  locator.click(); }
	 
	 
	
	 public static void selecton(WebDriver driver,WebElement locator, int timeout)//for dropdown 
	 { 
		 WebDriverWait wait = new WebDriverWait(driver,timeout);
	     wait.until(ExpectedConditions.elementToBeClickable(locator));
	     Select dropdown = new Select(locator); 
	     dropdown.selectByIndex(9);
	 }
	 
}
