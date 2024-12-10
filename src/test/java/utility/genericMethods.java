package utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericMethods {
	public WebDriver driver;
	public TestContextSetup textcontextsetup;
	public genericMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchToChildWindow()
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> i=windows.iterator();
		driver.switchTo().window(i.next());
		driver.switchTo().window(i.next());
	}

}
