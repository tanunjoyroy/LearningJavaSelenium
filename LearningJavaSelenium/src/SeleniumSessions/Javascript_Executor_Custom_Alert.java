package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_Executor_Custom_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		//Generate custom Alert during Test Execution at runtime to display important information
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('The login button is Not working')");
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
		
	}

}
