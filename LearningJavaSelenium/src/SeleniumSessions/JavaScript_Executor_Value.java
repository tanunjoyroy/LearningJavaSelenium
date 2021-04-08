package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_Value {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//WebElement.SendKeys() will work only when the textbox is enabled/visible but value with JS works even if textbox is disabled/not visible it only has to be present in DOM.

		
		WebElement userName = driver.findElement(By.xpath("//input[@id='login-username']"));
		
		js.executeScript("arguments[0].value='randomgmail@.com'", userName );
		
		//one more way of writing the syntax 
		
		//js.executeScript("arguments[0].value=arguments[1]", userName,"randomgmail@.com");
		
		//Note - using .value=' ' we can also clear textboxes(both enabled/disabled)
	}

}
