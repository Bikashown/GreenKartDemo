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
import PageObject.LandingPage;


public class greenKartStepdefinations {
	//public WebDriver driver;
	//public String productNameinMainPage;
	public String productNameinOfferPage;
	public TestContextSetup testconceptsetup;
	public greenKartStepdefinations(TestContextSetup testconceptsetup)
	{
		this.testconceptsetup=testconceptsetup;
	}
	
	
	@Given("User is on greenkart landing page")
	public void user_is_on_greenkart_landing_page() {
		
		//WebDriverManager.chromedriver().setup();
		//testconceptsetup.driver = new ChromeDriver();
		//testconceptsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	   
	}
	@When("User searched with shortname {string} amd extracted actual name of product")
	public void user_searched_with_shortname_amd_extracted_actual_name_of_product(String string) throws InterruptedException {
		//LandingPage landingpage=new LandingPage(testconceptsetup.driver);
		//testconceptsetup.driver.findElement(By.xpath("//*[@type='search']")).sendKeys(string);
		//landingpage.getsearchField().sendKeys(string);
		LandingPage landingpage=testconceptsetup.pageobjectfactory.getLandingPage();
		landingpage.getsearchField().sendKeys(string);
	   Thread.sleep(2000);
	  // testconceptsetup.productNameinMainPage=testconceptsetup.driver.findElement(By.cssSelector("h4.product-name")).getText().trim().split(" ")[0];
	   testconceptsetup.productNameinMainPage=landingpage.getprouctNameInLandingPage().getText().trim().split(" ")[0];
	   System.out.println(testconceptsetup.productNameinMainPage+" is extracted from Product Page.");
	}
	


}
