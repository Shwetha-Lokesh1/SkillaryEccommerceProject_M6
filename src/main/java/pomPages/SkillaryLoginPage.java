package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage {
	
	//declaration
	//address of gears
	
	@FindBy(xpath="//a[text()=' GEARS ']") 
	private WebElement gearbtn;
	
	//address of skillary demo
	@FindBy(xpath="//a[text()=' SkillRary Demo APP'])[2]") 
	private WebElement Skillrarydemoapp;
	
	//address of search textfield
	
	@FindBy(xpath="//input[@value='q']") 
	private WebElement searchtb;
	
	//address of search icon
	
		@FindBy(xpath="//input[@value='go']") 
		private WebElement searchbtn;
		
		//initialization
		
		public SkillaryLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		
		public void gearsbutton()
		{
			gearbtn.click();
		}
		
		public void Skillrarydemoapplication()
		{
			Skillrarydemoapp.click();
		}
		
		public void searchTaxtbox(String name)
		{
			searchtb.sendKeys(name);
		}
		
		public void gobutton(String name)
		{
			searchbtn.click();
		}
		
	
	
	
	
	
	
	
			

}
