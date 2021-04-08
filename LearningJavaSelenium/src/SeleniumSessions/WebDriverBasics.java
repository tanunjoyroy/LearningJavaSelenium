package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1.Firefox browser - To launch firefox we need gecko driver; gecko driver is a class in selenium; 
		//to use gecko driver we have to create an object but before that we need to download gecko driver exe file
		//to launch gecko driver we have to use firefoxdriver class , create an object of firefoxdriver class(1st step)
		
		//System.setProperty("webdriver.gecko.driver","D://Study//Naveen Automation//Latest Gecko driver//geckodriver-v0.26.0-win64//geckodriver.exe");
		//WebDriver driver = new FirefoxDriver(); //it will launch firefox browser*/
		
		// new FirefoxDriver is an object of FirefoxDriver() class which is referred by driver which is WebDriver reference variable
        // FirefoxDriver class is implementing WebDriver interface
		
		
		//2.Chrome browser
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google"))
		{
			System.out.println("title matches");
		}
		else
		{
			System.out.println("title did not match");
		}
	
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource()); to print the source code of the page in console
		driver.close();
		
		//to Close the current browser window we use driver.close()
		//to close all browser windows opened by current instance we use driver.quit()
		
		
		
	}
	
	

}
