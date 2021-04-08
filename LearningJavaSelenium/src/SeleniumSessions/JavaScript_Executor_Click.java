package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_Click {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		//Task is to enter an email address & then uncheck the Stay signed in checkbox
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("randomgmail.com");
		
		//driver.findElement(By.xpath("//input[@id='persistent']")).click(); //runtime exception 
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable
		
		//Alternative is to use JS
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("document.getElementById('persistent').click()");
		
		//As we have seen above that there are only 5 locators for JS there is also a way if we want to use xpath or css as well with JS



		WebElement checkBox = driver.findElement(By.xpath("//input[@id='persistent']"));
		
		js.executeScript("arguments[0].click()", checkBox); //checkBox (2nd parameter) will be replaced by arguments[0] */
		 
		//If we want to pass multiple arguments then js.executeScript("arguments[0].click(),arguments[1].click(),arguments[2].click()", checkBox,checkBox1,checkBox2) 
		

	}

}
