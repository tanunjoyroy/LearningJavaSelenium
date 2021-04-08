package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();//to delete cookies cache launching a fresh browser
		
		Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Add-Ons']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()='SpiceBiz']")).click();
	}

}
