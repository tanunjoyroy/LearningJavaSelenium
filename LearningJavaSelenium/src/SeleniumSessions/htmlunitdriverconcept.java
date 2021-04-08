package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriverconcept {

	public static void main(String[] args) throws InterruptedException {
		
		//htmlunitdriver jar is not available in selenium 3.x versions; in previous versions it was available with selenium JAR file
		//htmlunitdriver -- to use this concept we have to download htmlunitdriver JAR file
		
		//advantages:
		//1. Testing is happening behind the scene -- no browser is launched
		//2. Very Fast -- execution of test cases very fast -- very quickly we can get the result
		//3. Also known as Ghost driver & Headless Browser
		
		//Disadvantage :
		//1. Not suitable for Actions class -- user actions like mousemovement, double click & drag N drop.
		
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("Before login page title is:"+driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		
		System.out.println("After login page title is:"+driver.getTitle());
	}

}
