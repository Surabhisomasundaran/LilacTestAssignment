package com.lilac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2 {
	WebDriver driver;
	@FindBy(xpath ="//ul/li[@class='list-group-item justify-content-between']")
	List<WebElement> grouplist;
	@FindBy(xpath="/html/body/div/div[2]/div/ul/li[2]/text()")
	WebElement seconditeminthelist;
	@FindBy(xpath="//li[contains(text(), 'List Item 1']/span")
	WebElement badgevalue;
	public Test2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public int numberOfitemsinthelist() {
		List<WebElement> groupitems=grouplist;
		int itemscount=groupitems.size();
		System.out.println(itemscount);
		return itemscount;
		
	}
	public String identifyseconditemsvalueandbadgevalue() {
		List<WebElement> groupitems=grouplist;
		String seconditem=groupitems.get(1).getText();
		    System.out.println(seconditem);
		    return seconditem;
		}
}

		
	


	
	

