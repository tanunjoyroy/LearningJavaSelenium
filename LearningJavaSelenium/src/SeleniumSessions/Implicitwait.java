package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
        //make it a habit to use both the below waits always after launching N maximizing browser
		//both are global & dynamic waits
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //it will ask selenium to wait for 40 sec to load the full page N then perform any action
		//it is dynamic if the page is loaded in 2 secs then it would ignore the remaining 38 secs 
		//if the page is not loaded within 40 secs then it would throw err
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// implicit wait is for all the elements in the page lets say the page is fully loaded but some element has not fully displayed/some broken image selenium would wait for 20 secs for the element to load if it does not load error is thrown
		//it is dynamic if the page is loaded in 2 secs then it would ignore the remaining 18 secs 
		
	}

}
