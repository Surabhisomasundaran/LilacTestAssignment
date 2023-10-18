package com.lilac.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lilac.pages.Test1;

public class Test1Script extends Testhelper{
	
	@Test
	public void checkHomepageloadedwithemailandpasswordfields() {

		
		Test1 login=new  Test1(driver);
		Assert.assertTrue(login.isEmailfieldshowing());
		Assert.assertTrue(login.isPasswordfieldshowing());
		Assert.assertTrue(login.isSigninbuttonispresent());

		}
	@Test
	public void checkloginfieldsacceptsData() {
		Test1 login=new  Test1(driver);
		login.isLoginfieldsacceptscredentials("testlilac", "123456");
		
	}
	}


