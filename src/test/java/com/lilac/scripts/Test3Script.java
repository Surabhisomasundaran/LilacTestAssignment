package com.lilac.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lilac.pages.Test3;

public class Test3Script extends Testhelper {
	@Test
	public void checkDefaultoptionindropdownisshowingasoption1() {
    Test3 test3=new Test3(driver);
   Assert.assertEquals(test3.getdefaultValueindropdownoption(),"Option 1"); 
}
	@Test
	public void checkthirdoptionindropdownSelectsornot() {
    Test3 test3=new Test3(driver);
    test3.chooseoption3fromdropdown(); 
	
}
}