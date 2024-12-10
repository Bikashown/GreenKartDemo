package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.PageObjectFactory;

public class TestContextSetup {
	public WebDriver driver;
	public String productNameinMainPage;
	public TestBase testbase;
	public genericMethods genericmethod;
	public PageObjectFactory pageobjectfactory;
	//public String productNameinOfferPage;
	public TestContextSetup() throws IOException
	{
		testbase=new TestBase();
		pageobjectfactory=new PageObjectFactory(testbase.WebDriverManagers());
		genericmethod=new genericMethods(testbase.WebDriverManagers());
	}
}
