package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	//	ah.verifyDoubleClick();
	//	ah.verifyDragAndDrop();
		try {
			ah.verifyKeyboardActions();
		} catch (AWTException e) {
			e.printStackTrace();
		}	
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
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement target=driver.findElement(By.id("mydropzone"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).build().perform();//to perform drag and drop action
	}
	public void verifyKeyboardActions() throws AWTException
	{
		Robot robot=new Robot();//keyboard actions can be performed using Robot class
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
	}
	

}
