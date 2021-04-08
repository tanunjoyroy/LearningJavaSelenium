package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_DrawBorder {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		js.executeScript("arguments[0].style.border='6px solid red'", loginBtn);
		
		//During manual testing if we find a bug we usually take a screenshot & then draw border around the element which has the bug. JS helps us to draw a border around any    web Element in automation testing & then take screenshot using TakesScreenshot Interface
		
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(SrcFile, new File("D:\\Study\\Naveen Automation\\Selenium\\drawborder_drive.jpg")); //saved a file in d:
		 
		FileHandler.copy(SrcFile, new File("D:\\Study\\Naveen Automation\\Workspace\\LearningJavaSelenium\\src\\SeleniumSessions\\drawborder_eclipse.png")); //saved a file in eclipse

	}

}
