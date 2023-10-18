package com.lilac.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.lilac.pages.Test6;

public class Test6script extends Testhelper{
	
	@Test
		public void checkindaValueincoordinates2_2() {
			Test6 test6=new Test6(driver);
			Assert.assertEquals(test6.toGetCellvalueatcoordinates22(), "Ventosanzap");
		}

}
