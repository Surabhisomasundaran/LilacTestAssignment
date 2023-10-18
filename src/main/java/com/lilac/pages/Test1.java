package com.lilac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	WebDriver driver;
	
	@FindBy(xpath ="//input[@id='inputEmail']") 
	WebElement emailaddress;
	@FindBy(xpath ="//input[@id='inputPassword']") 
	WebElement password;
	@FindBy(xpath ="//button[@class='btn btn-lg btn-primary btn-block']")
	WebElement signin;
	public Test1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean isEmailfieldshowing() {
		return emailaddress.isDisplayed();
		
		

	}
	public boolean isPasswordfieldshowing() {
		return password.isDisplayed();
	}
	public boolean isSigninbuttonispresent() {
		return signin.isDisplayed();
	}
	public void isLoginfieldsacceptscredentials(String email, String paswrd) {
		emailaddress.click();
		emailaddress.sendKeys(email);
		password.click();
		password.sendKeys(paswrd);
			}
}
