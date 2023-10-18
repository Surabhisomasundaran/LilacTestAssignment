package com.lilac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test3 {
	WebDriver driver;
	
	@FindBy(xpath ="//a[text()='Option 1']") 
	WebElement Option1;
	@FindBy(xpath ="//a[text()='Option 3']") 
	WebElement Option3;
	
	@FindBy(xpath ="//button[@id='dropdownMenuButton']")
			WebElement dropdownbutton;
	String thirdoption;
	public Test3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public 	String getdefaultValueindropdownoption() {
			
			String defaultoption1=dropdownbutton.getText();
			System.out.println(defaultoption1);
			return  defaultoption1;
			
			
			}
	public void chooseoption3fromdropdown() {
	
	dropdownbutton.click();
	List<WebElement>options=driver.findElements(By.xpath("//div[@class='dropdown-menu show']"));
	for(WebElement option:options) {
		if (option.getText().equals(Option3)) {
			break;
		}
		Option3.click();
		}
	
	}
	
	}
	


