package com.lilac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test4 
{
	WebDriver driver;
	@FindBy(xpath ="//button[@class='btn btn-lg btn-primary']")
	WebElement primarybutton;
	@FindBy(xpath ="//button[@class='btn btn-lg btn-secondary']")
	WebElement secondarybutton;
	public Test4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean isFirstbuttonenabled() {
		
		return primarybutton.isEnabled();
	}
	
public boolean isSecondbuttondisabled() {
	return secondarybutton.isEnabled();
	}
}

