package com.lilac.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lilac.pages.Test3;
import com.lilac.pages.Test4;

public class Test4script extends Testhelper {
	@Test
	public void checkfirstbuttonisenabled() {
    Test4 test4=new Test4(driver);
   Assert.assertTrue(test4.isFirstbuttonenabled());
	}
	@Test
	public void checksecondarybuttonisdisabled() {
    Test4 test4=new Test4(driver);
    Assert.assertFalse(test4.isSecondbuttondisabled());
	}}
	
