package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OfferPage {
	
	public WebDriver driver;
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By editBoxTopDeal=By.xpath("//*[text()='Top Deals']");
	By editboxSearchField=By.id("search-field");
	By productNameOfferPage=By.xpath("//*[@class='table table-bordered']/tbody/tr/td[1]");
	
	public WebElement geteditBoxTopDeal()
	{
		return driver.findElement(editBoxTopDeal);
	}
	
	public WebElement geteditboxSearchField()
	{
		return driver.findElement(editboxSearchField);
	}
	
	public WebElement getOfferpageProductName()
	{
		return driver.findElement(productNameOfferPage);
	}

}
