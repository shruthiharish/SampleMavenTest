package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Lib.DriverListner;

public class SettNG {

	static WebDriver browser;
	static EventFiringWebDriver driver;
	static DriverListner listner;
	
	@BeforeTest
	public void setUp(){
		browser = new FirefoxDriver();
		driver = new EventFiringWebDriver(browser);
		listner = new DriverListner();
		driver.register(listner);
		driver.navigate().to("https://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
