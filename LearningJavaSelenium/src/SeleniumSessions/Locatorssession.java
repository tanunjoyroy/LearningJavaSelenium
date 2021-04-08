package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorssession {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
		//driver.findElement(By.linkText("register")).click();
		
		driver.findElement(By.xpath("//div[@class='_39M2dM JB4AMj']/input")).sendKeys("7975233454");
		
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
	}

}
