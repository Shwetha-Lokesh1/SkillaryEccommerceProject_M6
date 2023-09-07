package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillaryLoginPage;
import pomPages.SkillraryDemoLoginPage;

public class TestCase1 extends BaseClass{
	
	@Test
	public void tc1()
	{
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
		utilis.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilis.mouseOver(driver, sd.getCoursetab());
		sd.getSeleniumtraining();
		AddtoCartPage d=new AddtoCartPage(driver);
		utilis.doubleClick(driver, d.getAddbtn());
		d.carttocatbtn();
		utilis.alertPopup(driver);
		
		
	}

}
