package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//type="file" should be present for Browse/AttachFile/UploadFile buttons in html source then only sendkeys would work
		driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:/Users/Tanunjoy Roy/Desktop/iamtanunjoy.jpg");
	}

}
