package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class readPropertiesFile {
	
	

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prop = new Properties();
	    FileInputStream fp = new FileInputStream("D:\\Study\\Naveen Automation\\Workspace\\LearningJavaSelenium\\src\\SeleniumSessions\\environmentVariables.properties");
 
	    //FileInputStream class connects the java code to the properties file
	    
	    prop.load(fp);
	    
	    System.out.println(prop.getProperty("name"));
	    
	    //if the key is not present it will return Null N not any exception or err
	    //if the key is commented by using # N we are trying to retrieve it would return Null
	    
	    System.out.println(prop.getProperty("browser"));
	    
	    String url = prop.getProperty("URL");
	    
	    System.out.println(url);
	    
	    //handling multiple browsers
	    
	    if(prop.getProperty("browser").equals("chrome")) 
	    {
	    	System.setProperty("webdriver.chrome.driver","D://Study//Naveen Automation//Latest chrome driver 77//chromedriver_win32//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
			driver.findElement(By.xpath(prop.getProperty("next_btn_xpath"))).click();
			
	    }
	    else if(prop.getProperty("browser").equals("ff"))
	    {
	    	System.setProperty("webdriver.gecko.driver","D://Study//Naveen Automation//Latest Gecko driver//geckodriver-v0.26.0-win64//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get(url);
			
	    }
	    
	   
	   
	    
	    
	}

}
