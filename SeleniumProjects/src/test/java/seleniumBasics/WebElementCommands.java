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
		messageTextField.sendKeys("Hello World!!!");
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		System.out.println(showMessageButton.isDisplayed());
		System.out.println(showMessageButton.isEnabled());
		showMessageButton.click();
		WebElement message=driver.findElement(By.id("message-one"));
		System.out.println(message.getText());
		System.out.println(message.getTagName());
		System.out.println(message.getCssValue("background-color"));
		messageTextField.clear();
	}

}
