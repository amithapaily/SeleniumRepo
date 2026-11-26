package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling extends Base 
{

	public static void main(String[] args) 
	{
		FramesHandling fh = new FramesHandling();
		fh.initializeBrowser();
		fh.verifyFrames();
//		fh.closeBrowser();
	}
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		WebElement frame1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent();	
	}

}
