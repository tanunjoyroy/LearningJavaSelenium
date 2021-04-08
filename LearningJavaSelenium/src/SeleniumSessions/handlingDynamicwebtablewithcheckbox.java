package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingDynamicwebtablewithcheckbox {
    
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * • Using custom XPath • Using parent and preceding-sibling tags • No need to
		 * write for loop • No full iteration of table • Single line statement • More
		 * dynamic • Efficient and fast
		 */
		System.setProperty("webdriver.chrome.driver", "D://Study//Naveen Automation//Latest chrome driver version 89//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.cogmento.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("roytanunjoy@gmail.com");
		driver.findElement(By.name("password")).sendKeys("DONbox96");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		Thread.sleep(5000);
		
		clickable("ramu das");
		//clickable("tanisha roy");
		 
		

		
	}

	public static void clickable(String text)
	{
	WebElement element = driver.findElement(By.xpath("//a[(text()='ramu das')]/../../td/div/input"));
	element.click();
	//Actions actions = new Actions(driver);
	//actions.moveToElement(element).click().build().perform();
	}
}
