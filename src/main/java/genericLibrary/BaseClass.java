package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public Propertyfile pdata=new Propertyfile();
	public WebDriverUtilities utilis=new WebDriverUtilities();
	
	@BeforeMethod
	
	public void openApp() throws IOException

	{
		WebDriverManager.firefoxdriver().setup();
		
	
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get(pdata.getPropertydata("url"));
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

@AfterMethod

public void closeApp(ITestResult res) throws Throwable{
int status=res.getStatus();
String name=res.getName();
if(status==2) {
	//photo p=new photo(0)'
	
	Photo p=new Photo();
	p.getPhoto(driver, name);
	
	
}
driver.quit();
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
