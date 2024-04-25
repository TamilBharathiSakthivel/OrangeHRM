package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	
	//Parameterized Constructor
	public BasePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		/*PageFactory helps you in implementing PageObject model in Selenium Framework.
		 Initializes the page element so that you can work directly on the element without getting the NullPointerException
		(since the page object has been initialized implicitly)*/
	}
	
}