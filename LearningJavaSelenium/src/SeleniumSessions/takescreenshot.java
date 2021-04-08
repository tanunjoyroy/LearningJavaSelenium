package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takescreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Step 1) Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		//Step 2) Call getScreenshotAs method to create image file

		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 
		 //Step 3) Copy file to Desired Location
		 
		 FileHandler.copy(SrcFile, new File("D:\\Study\\Naveen Automation\\Selenium\\flipkart.jpg")); //saved a file in d:
		 
		 FileHandler.copy(SrcFile, new File("D:\\Study\\Naveen Automation\\Workspace\\LearningJavaSelenium\\src\\SeleniumSessions\\screenshot_flip.png")); //saved a file in selenium

	}

}
