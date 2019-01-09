package com.qa.TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.TestBase.BaseTest;

public class LogInTest extends BaseTest{

	@Test
	public void verifyTitle(){
		String title = driver.getTitle();
		SoftAssert sfa=new SoftAssert();
		sfa.assertEquals(title, "ToolsQA");
	}
}
