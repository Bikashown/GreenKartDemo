package PageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectFactory {
	
	public LandingPage landingpage;
	public OfferPage offerpage;
	public WebDriver driver;
	public PageObjectFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPage getLandingPage()
	{
		landingpage=new LandingPage(driver);
		return landingpage;
	}
	
	public OfferPage getOfferPage()
	{
		offerpage=new OfferPage(driver);
		return offerpage;
	}

}
