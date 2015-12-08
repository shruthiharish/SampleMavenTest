package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class GmailLogInPage {
	
	public GmailLogInPage(EventFiringWebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Email")
	private WebElement userName;
	public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(id="next")
	private WebElement nextButton;
	public WebElement getNextButton(){
		return nextButton;
	}
	/*
	@FindBy(name="Passwd")
	private WebElement psswdField;
    public WebElement getPsswdField(){
    	return psswdField;
    }
    
    @FindBy(name="signIn")
    private WebElement signIn;
    public WebElement getSignIn() {
    	return signIn;		
	}*/
}
