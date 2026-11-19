package seleniumBasics;
import org.openqa.selenium.By;

public class Locators extends Base
{

	public static void main(String[] args)
	{
		Locators loc=new Locators();
		loc.initializeBrowser();
		loc.verifyLocators();
	  //loc.closeBrowser();

	}
	public void verifyLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
//ELEMENT LOCATORS		
		
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Select"));
//  Syntax of CSS selector is tagname[attribute='attributevalue']
		driver.findElement(By.cssSelector("button[id='button-one']"));
//	/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button ---->Absolute Xpath
//	/tagname[@attribute='attributevalue']------------------------------->Syntax of Relative Xpath
		 driver.findElement(By.xpath("//button[@id='button-one']"));
		 
		 
//FEATURES OF XPATH
		 
//1. And Operator
		 driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
//2. Or Operator
		 driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
//3. text() function
		 driver.findElement(By.xpath("//button[text()='Show Message']"));
//4. starts-with function	 
		 driver.findElement(By.xpath("//button[starts-with(text(),'Show')]"));
//5.1 contains function for attribute
		 driver.findElement(By.xpath("//button[contains(@id,'-one')]"));
//5.2 contains function for text
		 driver.findElement(By.xpath("//button[contains(text(),'Message')]"));
		 
		 
//XPATH AXES METHODS
		 
// 1. Parent 		  
		 driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));// helps to access the parent of the element
// 2. Child	
		 driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));// helps to access the child of the element
// 3. Following
		 driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));// helps to access the following of the element
// 4. Preceding
		 driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
// 5. Ancestor
		 driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
// 6. Descendant		 
		 driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}

}
