package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_Calenders {

	public static void main(String[] args) {
		
		//Usually to handle Calenders we use 2 for loop concept N select a date by treating the calender as a table but its time complexity is O(n^2) which is time consuming.Where also sendkeys() wont work to enter the date.(D:\Study\Naveen Automation\Selenium\Handlingcalendar.txt)
		//To solve this we can use JavascriptExecutor to change the attribute 'value' in html DOM.selenium cannot change html dom structure or any attribute in the html dom hence we use javascript executor to implement this.
		//selenium cannot change html dom structure or any attribute in the html dom hence we use javascript executor to implement this

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement calender = driver.findElement(By.id("//input[@id='ctl00_mainContent_txt_Fromdate']"));
		
		js.executeScript("arguments[0].setAttribute('value','12-04-2021')", calender);*/
		
		
		//Note - currently this method is not working in spicejet as the datePicker element is more advanced now in the site but this method can be utilized as one of the way to handle calenders
		
		//Code to handle spicejet calender D:\Study\Naveen Automation\Selenium\Handling_Spicejet_Calender.txt

	}

	
}
