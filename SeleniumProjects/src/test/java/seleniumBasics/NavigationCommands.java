package seleniumBasics;

public class NavigationCommands extends Base
{

	public static void main(String[] args) 
	{
		NavigationCommands nc=new NavigationCommands();
		nc.initializeBrowser();
		nc.navigateCommand();
		//nc.closeBrowser();

	}
	public void navigateCommand()
	{
		driver.navigate().to("https://www.amazon.in");//to navigate from one web page to other web page.
		driver.navigate().back();//to navigate back to previous web page.
		driver.navigate().forward();// to navigate forward to next web page.
		driver.navigate().refresh();// to reload or refresh current web page
	}

}
