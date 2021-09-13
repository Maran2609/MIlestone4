package com.marriot.pageobjects;

import org.openqa.selenium.WebDriver;

import com.marriot.reusablecomponents.reusablemethods;
import com.marriot.uistore.Hotelsearchui;


public class Search {
	public static void Hotelsearch(WebDriver driver)
	{
		reusablemethods.click(Hotelsearchui.dest, driver);
	}
	public static void destination(String desti, WebDriver driver)
	{
		reusablemethods.sendkeys(Hotelsearchui.dest, desti, driver);
		
	}
	public static void button(WebDriver driver)
	{
		reusablemethods.click(Hotelsearchui.button, driver);
	}
	

}
