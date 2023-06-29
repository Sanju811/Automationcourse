package com.obsqura.base;

public class BrowserCommands1 extends Base1
{
	String title;
	String url;
	public void browserCommands() 
	{
		title = driver.getTitle();
		url = driver.getCurrentUrl();
		
	}
	public void verifyTitle()
	{
		if(title.equals("Obsqura Testing"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect Title");

		}
	}
	public void verifyUrl()
	{
		if(url.equals("https://selenium.obsqurazone.com/simple-form-demo.php"))
		{
			System.out.println("Correct url");

		}
		else
		{
			System.out.println("Incorrect url");

		}
	}

	public static void main(String[] args) 
	{
		BrowserCommands1 browsercommands1 = new BrowserCommands1();
		browsercommands1.initialiseBrowser();
		browsercommands1.browserCommands();
		browsercommands1.verifyTitle();
		browsercommands1.verifyUrl();
		browsercommands1.browserCloseOrQuit();

	}

}
