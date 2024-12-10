package Stepdefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.TestContextSetup;
import PageObject.OfferPage;
public class offerPageStepDefination {
	
	
	
	public String productNameinOfferPage;
	public TestContextSetup testconceptsetup;
	public offerPageStepDefination(TestContextSetup testconceptsetup)
	{
		this.testconceptsetup=testconceptsetup;
	}
	
	@Then("User searched for same shortname {string} in offer page to check if product exist with same name")
	public void user_searched_for_same_shortname_in_offer_page_to_check_if_product_exist(String string) throws InterruptedException {
	
		//Thread.sleep(2000);
		OfferPage offerpage=testconceptsetup.pageobjectfactory.getOfferPage();
		offerpage.geteditBoxTopDeal().click();
		testconceptsetup.genericmethod.switchToChildWindow();
		//testconceptsetup.driver.findElement(By.id("search-field")).sendKeys(string);
		offerpage.geteditboxSearchField().sendKeys(string);
		productNameinOfferPage=offerpage.getOfferpageProductName().getText();
	    System.out.println(productNameinOfferPage+" is extracted from offer page.");
	    Assert.assertEquals(testconceptsetup.productNameinMainPage,productNameinOfferPage,"Both names are matching.");
	}



}
