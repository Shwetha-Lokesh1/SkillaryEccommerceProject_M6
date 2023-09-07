package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//handling drop down
	
	public void dropDown(WebElement ele, String text)
	{
		Select s=new Select(ele);
				s.selectByVisibleText(text);
		
	}
	
	//handling mouse over
	
	public void mouseOver(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
	}
	
	//handling double click
	
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick().perform();
	}
	
	//handling right click
	
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//handling drag and drop
	
	public void dragdrop(WebDriver driver, WebElement src,WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	
	//shifting control to frame
	
	public void switchFrame(WebDriver driver)
	{
	driver.switchTo().frame(0);
	

}
	
	//shifting control to normal webpage
	
	public void switchbackFrame(WebDriver driver)
	{
	driver.switchTo().defaultContent();
	

}
	
	//shifting control to pop up
	
	public void alertPopup (WebDriver driver)
	{
	driver.switchTo().alert().accept();
	

}
	
	//shifting control to child window
	
	public void switchingtabs (WebDriver driver)
	{
		Set<String> child=driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
