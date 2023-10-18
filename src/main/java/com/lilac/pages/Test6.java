package com.lilac.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test6 {
	WebDriver driver;
	
	@FindBy(xpath="//table[@class='table table-bordered table-dark']")
	WebElement table;

	
	public Test6(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public String toGetCellvalueatcoordinates22(){
		
	
		WebElement tableRow = table.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table/tbody/tr[1]"));
        String rowtext = tableRow.getText();
		 WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"test-6-div\"]/div/table/tbody/tr[3]/td[3]"));
		    String valueIneed = cellIneed.getText();
		    System.out.println("Cell value is : " + valueIneed); 
		    return valueIneed;
		    
}

}
    

		
		



	
