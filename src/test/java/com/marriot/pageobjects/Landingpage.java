package com.marriot.pageobjects;

import org.openqa.selenium.WebDriver;

import com.marriot.reusablecomponents.reusablemethods;
import com.marriot.uistore.Landingpageui;

public class Landingpage {
	public static boolean mainpage(WebDriver driver)
	{
		if(reusablemethods.click(Landingpageui.Ourbrands, driver));
		{
			return true;
		}	
  }
	public static boolean verifiy(WebDriver driver)
	{
		if(driver.findElement(Landingpageui.Logo).isDisplayed())
		{
			
			return true;
		}
		return false;
	}

}
