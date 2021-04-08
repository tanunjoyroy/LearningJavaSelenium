package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List <WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size()); 
		
		for(int i=0;i<list.size();i++)
		{
			String z = list.get(i).getText();
			System.out.println(z);
			
		}
		
	}

}
