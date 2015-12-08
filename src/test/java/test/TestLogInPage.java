package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

import com.sun.jna.platform.win32.GL;

import pom.GmailLogInPage;

public class TestLogInPage extends SettNG{
	
	GmailLogInPage gLogIn;
	
	@BeforeClass
	public void createObjs(){
		gLogIn = new GmailLogInPage(driver);
	}
	
	@Test
	public void TestAutoLogIn(){
		gLogIn.getUserName().sendKeys("shruthijagadiesh07");
		gLogIn.getNextButton().click();
		//gLogIn.getPsswdField().sendKeys("12345");
		//gLogIn.getSignIn().click();
	}
	
	

}
