package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.GmailLogInPage;

public class LogInPageTest  extends SettNG{
GmailLogInPage gLogIn;
	
	@BeforeClass
	public void createObjs(){
		gLogIn = new GmailLogInPage(driver);
	}
	
	@Test
	public void AutoLogInTest(){
		gLogIn.getUserName().sendKeys("shruthijagadiesh07");
		gLogIn.getNextButton().click();
	}
	
}
