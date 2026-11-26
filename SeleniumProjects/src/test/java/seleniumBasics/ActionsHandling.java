package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHandling extends Base
{
	public static void main(String[] args) 
	{
		ActionsHandling ah=new ActionsHandling();
		ah.initializeBrowser();
	//	ah.verifyRightClick();
	//	ah.verifyMouseHover();
		ah.verifyDoubleClick();
	//	ah.closeBrowser();
	}
	public void verifyRightClick()
	{
		WebElement others=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.contextClick(others).build().perform();//to perform right click action.build() and perform() are used in all mouse action
	}
	public void verifyMouseHover()
	{
		WebElement others=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.moveToElement(others).build().perform();//to perform mouse hover action.
	}
	public void verifyDoubleClick()
	{
		WebElement others=driver.findElement(By.id("others"));
		Actions act=new Actions(driver);
		act.doubleClick(others).build().perform();//to perform double click action.
		
	}

}
