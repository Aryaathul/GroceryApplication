package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitUtility;

public class LoginPage {
	
	public WebDriver driver;
	WaitUtility wu= new WaitUtility();
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//login
	@FindBy(name="username") WebElement userName;
	@FindBy(name="password")WebElement password;
	@FindBy(xpath="//label[@for='remember']") WebElement rememberCheck;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signInButton;
	
	//check login
	@FindBy(xpath="//b[text()='7rmart supermarket'] ") WebElement textInloginPage;
	
	public LoginPage userName(String userNameValue)
	{
		userName.sendKeys(userNameValue);
		return this;
	}
	
	public LoginPage password(String passwordValue)
	{
		password.sendKeys(passwordValue);
		return this;
	}
	public LoginPage remember()
	{
		rememberCheck.click();
		return this;
	}
	
	public HomePage signIn() 
	{
		wu.waitUntilElementToBeClickable(driver,signInButton);
		signInButton.click();
		return new HomePage(driver);
	}
	
	public String confirmLoginpagesStoreName()
	{
		return textInloginPage.getText();
	}
	
	public boolean  isTextDisplayed()
	{
		return textInloginPage.isDisplayed();
	}
	
}
