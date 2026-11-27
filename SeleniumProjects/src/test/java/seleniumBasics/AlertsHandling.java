package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertsHandling extends Base 
{

	public static void main(String[] args) 
	{
		AlertsHandling ah=new AlertsHandling();
		ah.initializeBrowser();
//		ah.verifySimpleAlert();
		ah.verifyConfirmAlert();
//		ah.closeBrowser();
	}
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleAlertButton=driver.findElement(By.id("alertButton"));
		simpleAlertButton.click();
		Alert alert=driver.switchTo().alert();//creates an object of alert interface and switch the focus of Selenium to alert
		alert.accept();
	}
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmAlertButton=driver.findElement(By.id("confirmButton"));
		confirmAlertButton.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
