package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_Highlight_Elements {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		flash(loginBtn,driver);
		
	 }
	public static void flash(WebElement element, WebDriver driver) 
	{
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor"); //get the colour of the element here button
        for (int i = 0; i <  100; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1 rgb(0,200,0) is the rgb code for green this statement will change the colour of the button to green 
            changeColor(bgcolor, element,driver);//2 alternatively it will change the colour to its original colour for 100 times
    }}
	public static void changeColor(String color, WebElement element, WebDriver driver) 
	{
	    	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

	        try {
	            Thread.sleep(20);
	        }  catch (InterruptedException e) {
	        }
	     }

	}


