package com.lilac.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.lilac.pages.Test1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testhelper {
	WebDriver driver;
	
	
@BeforeMethod
	
	 
	@Parameters({ "browser" })
	public void launchbrowser(String browser) {


		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("InternetExplorer")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Tools\\Webdriver_Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Surabhi/Downloads/QE-index.html#");
		
}

//@AfterMethod
	public void closeBrowser() {	
	driver.close();

}
	
}
