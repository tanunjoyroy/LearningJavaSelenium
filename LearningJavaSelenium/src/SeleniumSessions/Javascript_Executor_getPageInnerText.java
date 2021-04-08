package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_Executor_getPageInnerText {

	public static void main(String[] args) {
		//Get innertext of page by using JS - In selenium we dont have any method to read the text of the entire webpage 
		//[Dont confuse with driver.getPageSource() it is different; it is used to read the HTML page]
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String innerText=js.executeScript("return document.documentElement.innerText").toString();
		
		System.out.println(innerText);
		
		

	}

}
