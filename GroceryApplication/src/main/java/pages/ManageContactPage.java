package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {

public WebDriver driver;
	
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//managecontact=editbutton
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1'and @role='button']")WebElement manageContactActionButton;
	@FindBy(id="phone")WebElement phoneNumberTextBox;
	@FindBy(id="email")WebElement emailTextBox;
	@FindBy(name="address")WebElement addressTextBox;
	@FindBy(name="Update")WebElement updateButton;
	
	
	public ManageContactPage manageContactAction()
	{
		manageContactActionButton.click();
		return this;
	}
	
	public ManageContactPage enterPhoneNumber(String newPhoneNum)
	{
		phoneNumberTextBox.clear();
		phoneNumberTextBox.sendKeys(newPhoneNum);
		return this;
	}
	
	public ManageContactPage enterEmail(String newEmail)
	{
		emailTextBox.clear();
		emailTextBox.sendKeys(newEmail);
		return this;
	}
	
	public ManageContactPage enterAddress(String newAddress)
	{
		addressTextBox.clear();
		addressTextBox.sendKeys(newAddress);
		return this;
	}
	
	public void updateInfo()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; //casting -interface name inside the bracket and passing driver outside.
		js.executeScript("arguments[0].click();",updateButton);
		
	}
	
	
}
