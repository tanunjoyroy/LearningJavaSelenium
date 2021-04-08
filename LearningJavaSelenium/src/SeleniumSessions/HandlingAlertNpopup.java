package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertNpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		//alert pop ups are also called javascript pop ups
		Alert al = driver.switchTo().alert(); //first we need to move the control from background page to alert
		//Object Creation for Alert class
        //We create a reference variable al for Alert class and references it to the alert.
		
		
		String popupmsg = al.getText();
		
		if(popupmsg.equals("Please enter a valid user name"))
		{
			System.out.println("alert message matches");
		}
		else
		{
			System.out.println("alert message does not match");
		}
			
		
		System.out.println(popupmsg);
		
		al.accept(); //to click on OK
		//al.dismiss(); // to click on cancel

		
		
		
	}

}
