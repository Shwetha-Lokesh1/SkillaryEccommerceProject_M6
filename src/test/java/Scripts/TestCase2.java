package Scripts;

import java.io.IOException;

import genericLibrary.BaseClass;
import pomPages.SkillaryLoginPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.Testing;

public class TestCase2 extends BaseClass{
	
	public void tc2() throws Throwable
	{
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilis.switchingtabs(driver);
		utilis.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
		Testing tp=new Testing(driver);
		utilis.dragdrop(driver, tp.getseleniumtraining(), tp.getCartTab());
		
	}

}
