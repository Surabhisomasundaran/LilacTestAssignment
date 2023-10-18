package com.lilac.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.lilac.pages.Test5;

public class Test5script extends Testhelper {
	@Test
	public void checkdisplaymessageshowing() {
		Test5 test5=new Test5(driver);	
		Assert.assertEquals(test5.isSuccessmessageshowinguponclickingonbutton5(),"You clicked a button!");
		
   
	}
	@Test
	public void checkdisplaymessageshowingandbutton5isdisabledafterthat() {
		Test5 test5=new Test5(driver);	
		Assert.assertFalse(test5.isbutton5disabledaftersuccessmessage());

	}
}
