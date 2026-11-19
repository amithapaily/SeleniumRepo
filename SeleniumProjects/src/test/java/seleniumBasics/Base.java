package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class Base 
{
	public WebDriver driver;//global variable used to access driver in other classes.

	public static void main(String[] args) 
	{
		Base b=new Base();
		b.initializeBrowser();
		b.closeBrowser();

	}
	public void initializeBrowser()
	{
		driver=new ChromeDriver();//to open Chrome browser
		//driver =new SafariDriver();
		//driver=new FirefoxDriver();
		driver.get("https://selenium.qabible.in");//to open the url
		driver.manage().window().maximize();//to maximize the browser window.
	}
	public void closeBrowser()
	{
		//driver.close();// to close current tab only.
		driver.quit();//to close current browser.	
	}
	

}
