package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	//declaration
	
	//address of course web element
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	//address of selenium training
	@FindBy(xpath="//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//addressof dropdown
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//initialization
	
	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getCoursetab() {
		return coursetab;
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getCoursedd() {
		return coursedd;
	}

	

	
	

	
	

	

	
	
	
	
	
	
	
	
	

}
