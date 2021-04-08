package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDynamicSearchexample1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("messi");
		
		List<WebElement> listOfSuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@class='sbl1']"));
		System.out.println("Number of suggestions as per search text " + listOfSuggestion.size());
		
		for(int i=0;i<listOfSuggestion.size();i++)
		{
			String text = listOfSuggestion.get(i).getText();
			
			if (text.equalsIgnoreCase("messi vs ronaldo"))
			{
				listOfSuggestion.get(i).click();
				break;
			}
		}
		
		
	}

}
