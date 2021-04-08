package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingBrowserWindowPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #4']")).click();
		
		Set<String> handleIds = driver.getWindowHandles(); //getWindowHandles() will give a set object of window id's.
		
		//Set object does not store the values on the basis of indexes. 
		//So we use iterator to iterate through the set to retrieve the values.
		//By default the control/iterator(it object) is at the top of the set hence to go to the 1st value we have to use next().
		//1st value will always be the parent id.
		
		Iterator<String> it = handleIds.iterator();
		
		String parentWindowId = it.next();
		String childWindowId = it.next();
	    
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); //it will only close the specific window
		
		//driver.quit(); //it will close all the windows
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
