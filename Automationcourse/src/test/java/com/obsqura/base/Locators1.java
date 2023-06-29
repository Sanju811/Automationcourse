package com.obsqura.base;

import org.openqa.selenium.By;

public class Locators1 extends Base1
{
	public void locateById()
	{
		driver.findElement(By.id("single-input-field"));
	}
	
	public void locateByLinkText(String linkText)
	{
		driver.findElement(By.linkText(linkText));
	}
	public void navigateCommand(String url)
	{
		driver.navigate().to(url);
	}
	public void locateByClassname()
	{
		driver.findElement(By.className("input-group-text"));
	}
	public void locateByName()
	{
		driver.findElement(By.name("daterange"));
	}

	public static void main(String[] args) 
	{
		Locators1 locators1 = new Locators1();
		locators1.initialiseBrowser();
		locators1.locateById();
		locators1.locateByLinkText("Checkbox Demo");
		locators1.navigateCommand("https://selenium.obsqurazone.com/form-submit.php");
		locators1.locateByClassname();
		locators1.navigateCommand("https://selenium.obsqurazone.com/date-picker.php");
		locators1.locateByName();
		locators1.navigateCommand("https://selenium.obsqurazone.com/table-pagination.php");
		locators1.locateByLinkText("Table Data Download");
		locators1.browserCloseOrQuit();
	}
}



