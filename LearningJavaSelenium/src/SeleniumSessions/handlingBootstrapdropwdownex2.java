package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingBootstrapdropwdownex2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.xpath("//div[@class='TquXA']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='OA0qNb ncFHed']/div/span"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			String lan = list.get(i).getText();
			System.out.println(lan);
			if(lan.equals("?Deutsch?"))
			{
				list.get(i).click();
				break;
			}
		}

	}

}
