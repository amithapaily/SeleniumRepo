package seleniumBasics;

public class BrowserCommands extends Base 
{

	public static void main(String[] args) 
	{
		BrowserCommands bc=new BrowserCommands();
		bc.initializeBrowser();
		bc.verifyCommands();
		bc.closeBrowser();
	}
	public void verifyCommands()
	{
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		String url=driver.getCurrentUrl();
		System.out.println("Current URL is: "+url);
		String handleId=driver.getWindowHandle();
		System.out.println("Window Handle ID is: "+handleId);
		String source=driver.getPageSource();
		System.out.println("Page source is: "+source);
	}

}
