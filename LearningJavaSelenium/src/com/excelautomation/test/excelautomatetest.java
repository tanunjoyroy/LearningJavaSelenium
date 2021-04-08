package com.excelautomation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.xcelreadwrite;

public class excelautomatetest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Naveen Automation\\Latest chrome driver version 79\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		xcelreadwrite sheetObj = new xcelreadwrite("D:\\Study\\Naveen Automation\\Workspace\\LearningJavaSelenium\\src\\com\\testdata\\ExcelAutomation.xlsx");
		int rowcnt = sheetObj.getRowCount("RegTestData");
		System.out.println(rowcnt);
		
		//adding a new column in sheet
		//while writing data in an excel sheet we should make usre the excel is closed & then run
		//iwhile read operation sheet can be open
		
		sheetObj.addColumn("RegTestData", "Status");
		
		for(int i = 2;i<=rowcnt;i++)
		{
			
			String first_name = sheetObj.getCellData("RegTestData", "First Name", i);
			System.out.println(first_name);
			String last_name = sheetObj.getCellData("RegTestData", "Last Name", i);
			System.out.println(last_name);
			String mobile_no = sheetObj.getCellData("RegTestData", "Mobile No", i);
			String email_id = sheetObj.getCellData("RegTestData", "Email Id", i);
			System.out.println(email_id);
			String gender = sheetObj.getCellData("RegTestData", "Gender", i);
			
			driver.findElement(By.name("firstname")).clear();
			driver.findElement(By.name("firstname")).sendKeys(first_name);
			
			
			
			driver.findElement(By.name("lastname")).clear();
			driver.findElement(By.name("lastname")).sendKeys(last_name);
			
			driver.findElement(By.name("reg_email__")).clear();
			driver.findElement(By.name("reg_email__")).sendKeys(email_id);
			
			sheetObj.setCellData("RegTestData", "Status", i, "Pass");
			
			/*
			 * driver.findElement(By.xpath("//input[@name=\"sex\"][1]")).clear();
			 * driver.findElement(By.xpath("//input[@name=\"sex\"][1]")).click();
			 */
			
		}
	}

}
