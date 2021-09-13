package com.marriot.pageobjects;

import org.openqa.selenium.WebDriver;

import com.marriot.reusablecomponents.reusablemethods;
import com.marriot.uistore.Thirdtestcaseui;

public class ThirdTest {
	
	public static void member(WebDriver driver)
	{
		reusablemethods.click(Thirdtestcaseui.link, driver);
	}

}
