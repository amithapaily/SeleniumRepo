package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base 
{

	public static void main(String[] args) 
	{
		 WebElementCommands we=new WebElementCommands();
		 we.initializeBrowser();
		 we.verifyWebElementCommands();
	   //we.closeBrowser();
	}
	public void verifyWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement messageTextField= driver.findElement(By.id("single-input-field"));
		messageTextField.sendKeys("Hello World");
	}

}
