package com.lilac.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test5 {
	WebDriver driver;
	
	WaitUtility waitutility=new WaitUtility();
	@FindBy(xpath ="//button[@id='test5-button']") 
	WebElement testbutton;
	@FindBy(xpath ="//div[@id='test5-alert']") 
	WebElement successmessage;
	public Test5(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String isSuccessmessageshowinguponclickingonbutton5()  {
		waitutility.waitforelementtobeClickable(driver, testbutton);
	
		testbutton.click();
		successmessage.isDisplayed();
		String displaymessage=successmessage.getAttribute("innerText");
		System.out.println(displaymessage);
		return displaymessage;
		}
	public boolean isbutton5disabledaftersuccessmessage()  {
		waitutility.waitforelementtobeClickable(driver, testbutton);
	
		testbutton.click();
		successmessage.isDisplayed();
	    return 	testbutton.isEnabled();
		
		
		}
	
}
