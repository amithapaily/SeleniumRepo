package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base
{

	public static void main(String[] args) 
	{
		TableHandling th=new TableHandling();
		th.initializeBrowser();
		th.verifyTable();
//		th.closeBrowser();

	}
	public void verifyTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.id("dtBasicExample"));
		System.out.println(table.getText());
		WebElement headingRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr"));
		System.out.println(headingRow.getText());
		WebElement firstRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(firstRow.getText());
		WebElement name1=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(name1.getText());
		
		
	}

}
