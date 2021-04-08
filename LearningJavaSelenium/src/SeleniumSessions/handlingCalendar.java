package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingCalendar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		String date = "12/41/2019";
		String dateArr[] = date.split("/");
		String day = dateArr[1];
		
		String beforeXpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[";
		String afterXpath = "]/td[";
		
		boolean flag = false;
		String actualday = null; //declaring here so that it is applicable all throughout the loops
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=7;j++)
			{
				
				String finalXpath = beforeXpath+i+afterXpath+j+"]";
				
				try {
				actualday = driver.findElement(By.xpath(finalXpath)).getText();
				}
				catch(NoSuchElementException e)
				{
					System.out.println("please enter a valid date");
					flag = true;
					break;
				}
				
				if (actualday.equals(day))
				{
					driver.findElement(By.xpath(finalXpath)).click();
					flag = true;
					break; // coming out of the inner loop
				}
				
				}
			//break; 
			// to come out of the outer loop we wont be using break directly because for eg. we want to select 30th dec 2019
			//then when the if condition at line 37(as 1st iteration as tr[1]td[1] is 1st dec) fails the control will come to line 45 & 
			//it will come out of the outer loop also hence we have use to flag
			
			 if (flag) 
			 { 
				 break; //come out of the outer loop
			 }
			 
		}
		
	}

}
