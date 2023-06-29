package com.obsqura.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base1 
{
	public WebDriver driver;
	public void initialiseBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\Automationcourse\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	public void browserCloseOrQuit()
	{
		//driver.close();
		driver.quit();
	}
	public static void main(String[] args)
	{
		Base1 base1 = new Base1();
		base1.initialiseBrowser();
		base1.browserCloseOrQuit();

	}

}
