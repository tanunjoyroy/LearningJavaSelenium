package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise {

	public static void main(String[] args) {
		//To test if a webpage is loaded in 5 secs or not
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
			
			driver.get("http://www.google.com");
			System.out.println(driver.getTitle());
			driver.get("http://www.amazon.in");
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println(driver.getTitle());
			driver.navigate().forward();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			System.out.println(driver.getTitle());
			}
			
		
		
		
	}


