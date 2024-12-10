package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchField=By.xpath("//*[@type='search']");
	By prouctNameInLandingPage=By.cssSelector("h4.product-name");
	
	public WebElement getsearchField()
	{
		return driver.findElement(searchField);
	}
	
	public WebElement getprouctNameInLandingPage()
	{
		return driver.findElement(prouctNameInLandingPage);
	}

}
