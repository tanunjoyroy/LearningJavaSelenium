package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws Exception, Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Naveen Automation\\Latest chrome driver version 79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//1.get the list of links & images(can sometime acts as links) in the webpage 
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println(linksList.size());
		
		//2.filter the list with only links having href property (some links might be present in webpage which does not direct to a different page hence no href)
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		for(int i = 0;i<linksList.size();i++)
		{
			if(linksList.get(i).getAttribute("href") != null)
			{
				
				activeLinks.add(linksList.get(i));
			}
             
		}
		
		System.out.println(activeLinks.size());
		
		//3.We are going to make use of HTTPUrlConnection api/class in java
		
		//-Create an object of URL class & pass the list of links in the arg
		//-Cast it to HttpURLConnection class
		//-Open the connection
		//-connect 
		//-getresponsemessage after hitting the link
		//-disconnect
		
		
		for(int j =0;j<activeLinks.size();j++)
		{
			HttpURLConnection httpopenConnection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		    httpopenConnection.connect();
		    String response = httpopenConnection.getResponseMessage();
		    httpopenConnection.disconnect();
		    
		    System.out.println("the response code of each link-->"+response);
		
		}
	}

}