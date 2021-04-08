package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor_ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("http://demo.guru99.com/test/guru99home/"); For eg1.&2
		
		//driver.get("https://learn-automation.com/how-to-scroll-into-view-in-selenium-webdriver/"); for eg.3.i
		
		//driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html"); //for eg.3.ii
		
		//driver.get("http://demo.guru99.com/test/guru99home/scrolling.html"); //for eg.4
		
		driver.get("https://news.google.com/"); //for eg.5
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*1.scroll down by a specific pixels //both scrollTo & scrollBy will work
		
		js.executeScript("window.scrollTo(0,1000)");
		js.executeScript("window.scrollBy(0,1000)");*/
		
		/*2.scroll till the bottom of the page //both scrollTo & scrollBy will work
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		document.body.scrollHeight will return the height of the page*/
		 
		//3.scrollIntoView - It will keep on scrolling until element is not visible or in view	
		//i
		//WebElement link = driver.findElement(By.xpath("//a[text()='Learn Automation page']"));
		
		//js.executeScript("arguments[0].scrollIntoView();",link);
		
		//ii this site has inner scroll bars
		
		/*WebElement para = driver.findElement(By.xpath("//div[@id=\"mCSB_7_container\"]/p[7]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",para);
		
		System.out.println(para.getText());*/
		
		//4.Horizontal Scroll on the webpage till the element is found
		
		//WebElement horiEle = driver.findElement(By.xpath("//a[text()='VBScript']"));
		
		//js.executeScript("arguments[0].scrollIntoView();",horiEle);
		
		//5.scroll into view
		
		WebElement healthLink = driver.findElement(By.xpath("//span[text()='Health']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();",healthLink);
		
		
		

	}

}
