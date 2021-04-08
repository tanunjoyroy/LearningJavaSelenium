package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdynamicwebtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		
		//handling table rows data
		String beforeXpath = "//div[@id='content']/table/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		//no of rows in a table is dynamic it can change in future to handle this
		
		List<WebElement> Rows = driver.findElements(By.xpath("//div[@id='content']/table/tbody/tr"));
		int totalRows = Rows.size();
		System.out.println(totalRows);
		
		for(int i=1; i<=totalRows; i++)
		{
			String actualXpath = beforeXpath+i+afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			
			if(element.getText().equals("China"))
			{
				String actualText = element.getText();
				System.out.println(actualText);
				break;
			}
		}
		
		//handling table column data
		
		String beforeXpathCol = "//div[@id='content']/table/thead/tr/th[";
		String afterXpathCol = "]";
		
		//no of Columns in a table is dynamic it can change in future to handle this
		
		List<WebElement> Cols = driver.findElements(By.xpath("//div[@id='content']/table/thead/tr/th"));
		int totalCols = Cols.size();
		System.out.println(totalCols);
		
		for(int i=1; i<=totalCols; i++)
		{
			String actualXpathCol = beforeXpathCol+i+afterXpathCol;
			WebElement element = driver.findElement(By.xpath(actualXpathCol));
			
			if(element.getText().equals("Built"))
			{
				String actualText = element.getText();
				System.out.println(actualText);
				break;
			}
		}
			
		
		
		
		
		}
	}
