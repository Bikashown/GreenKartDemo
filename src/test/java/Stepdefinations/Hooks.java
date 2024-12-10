package Stepdefinations;

import java.io.IOException;

import io.cucumber.java.After;
import utility.TestContextSetup;

public class Hooks {
	public TestContextSetup testconceptsetup;
	public Hooks(TestContextSetup testconceptsetup)
	{
		this.testconceptsetup=testconceptsetup;
	}
	
	@After
	public void closeApp() throws IOException
	{
		testconceptsetup.testbase.WebDriverManagers().quit();
	}

}