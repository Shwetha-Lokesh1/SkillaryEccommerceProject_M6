package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	
	//declaration
	
	//address of selenium training
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtarining;
	
	//address ofadd to cart
	
		@FindBy(id="mycart")
		private WebElement carttab;
		
		
		//address of facebook
		
		@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
		private WebElement facebook;
		
		//initialization
		
		public Testing(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		
		public WebElement getseleniumtraining()
		{
			return seleniumtarining; 
		}
		
		public WebElement getCartTab()
		{
			return carttab; 
		}
		public WebElement getFacebook()
		{
			return facebook; 
		}
		public void facebookicon()
		{
			facebook.click();
		}


}


