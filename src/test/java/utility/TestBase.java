package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*; 
import java.io.*; 
public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManagers() throws IOException
	{
		//FileInputStream fis=new FileInputStream("E:\\Automation\\PMC\\src\\test\\resource\\test.properties");
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resource\\test.properties");
		Properties prop = new Properties();   
		prop.load(fis);
		if(driver==null)
		{
			String browserName=prop.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				//driver.get(prop.getProperty("url"));
			}
			else if(browserName.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				//driver.get(prop.getProperty("url"));
			}
			else
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				//driver.get(prop.getProperty("url"));
			}
			driver.get(prop.getProperty("url"));
		}
	return driver;
	}
}
