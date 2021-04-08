package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("roytanunjoy@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Donbosco@2060");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		//We can even identify total number of iframes by using below snippet.
		int size1 = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size1);
		
		driver.switchTo().frame("downloadFrame");		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();

	}

}
