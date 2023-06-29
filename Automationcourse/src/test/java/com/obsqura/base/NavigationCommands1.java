package com.obsqura.base;


public class NavigationCommands1 extends Base
	{
		public void navigationCommands()
		{
			driver.navigate().to("https://www.amazon.in/");
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
		}
		
		public static void main(String[] args)
		{
			NavigationCommands1 navigationcommands1 = new NavigationCommands1();
			navigationcommands1.intialisebrowser();
			navigationcommands1.navigationCommands();
			navigationcommands1.browserCloseOrQuit();

		}

		
	}



