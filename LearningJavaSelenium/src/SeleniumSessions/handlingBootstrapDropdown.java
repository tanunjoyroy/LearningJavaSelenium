package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingBootstrapDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
		
		/*
		 * To identify a bootstrap dropdown
		 * 
		 * 1. Inspect the dropdown 2. Select tag wont be present
		 */
		
		driver.findElement(By.xpath("//button[text()='jQuery, JavaScript, CSS']")).click();
		
		//Method 1
		driver.findElement(By.xpath("//ul//li//input[@value='HTML']")).click();
		driver.findElement(By.xpath("//ul//li//input[@value='jQuery']")).click();
		
		//Method 2
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		
		String beforexpath = "//div/form/div/ul/li[";
		String afterxpath = "]";
		
		
		int sizeList = list.size();
		System.out.println(sizeList);
		
		for(int i=1;i<sizeList;i++)
		{
			
			WebElement element = driver.findElement(By.xpath(beforexpath+i+afterxpath));
			System.out.println(element.getText());
			
			if (element.getText().equals("HTML"))

			{
				WebElement checkbox = driver.findElement(By.xpath(beforexpath+i+afterxpath+"//input"));
				checkbox.click();
				break;
			}

		}
	}

}
