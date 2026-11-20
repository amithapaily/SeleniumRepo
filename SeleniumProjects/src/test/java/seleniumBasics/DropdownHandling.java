package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling extends Base
{

	public static void main(String[] args)
	{
		DropdownHandling dh=new DropdownHandling();
		dh.initializeBrowser();
//		dh.verifyDropdown();
//		dh.verifyCheckbox();
		dh.verifyRadioButton();
//		dh.closeBrowser();

	}
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdown);
		
// SELECT BY INDEX
//		select.selectByIndex(2);
		
//SELECT BY VALUE
//		select.selectByValue("sql");
		
//SELECT BY VISIBLE TEXT
		select.selectByVisibleText("C#");
	}
	
	public void verifyCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
	}
	
	public void verifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton=driver.findElement(By.xpath("//input[@value='yellow']"));
		radioButton.click();
	}
	

}
