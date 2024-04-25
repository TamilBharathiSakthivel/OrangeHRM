package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]") WebElement img_logo;
	@FindBy(name="username") WebElement txt_Username_loc;
	@FindBy(name="password") WebElement txt_Password_loc;
	@FindBy(how = How.XPATH, using="//button[normalize-space()='Login']") WebElement btn_login_loc;
	//@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login_loc;

	
	public void setUserName(String name)
	{
		txt_Username_loc.sendKeys(name);
	}
	
	public void setPassword(String pwd)
	{
		txt_Password_loc.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login_loc.click();
	}
	

}