package com.lilac.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lilac.pages.Test2;

public class Test2script extends Testhelper {
	//@Test
	public void Checkthenumberofitemsinthelist() {
		 Test2 test2=new  Test2(driver);
		Assert.assertEquals(test2.numberOfitemsinthelist(),3);
	}
	@Test
	public void Checktheseconditemsvalue() {
		 Test2 test2=new Test2(driver);
		Assert.assertEquals(test2.identifyseconditemsvalueandbadgevalue(), "List Item 2 6");
}
}
