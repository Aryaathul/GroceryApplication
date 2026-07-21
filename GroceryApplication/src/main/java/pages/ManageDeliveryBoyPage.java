package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageDeliveryBoyPage {
	
	public WebDriver driver;
	public ManageDeliveryBoyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//adding new user in manage delivery boy page
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/add']")WebElement NewButton;
	@FindBy(id="name")WebElement nameField;
	@FindBy(id="email")WebElement emailField;
	@FindBy(id="phone")WebElement phoneNumberField;
	@FindBy(name="address")WebElement addressField;
	@FindBy(id="username")WebElement userNameField;
	@FindBy(id="password")WebElement passwordField;
	@FindBy(name="create")WebElement saveButton;
	
	//assertion to check whether user is created successfully
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	
	
	public ManageDeliveryBoyPage newButtonClick()
	{
		NewButton.click();
		return this;
	}
	
	public ManageDeliveryBoyPage enterName(String fullname)
	{
		nameField.sendKeys(fullname);
		return this;
	}
	
	public ManageDeliveryBoyPage enterEmail(String email)
	{
		emailField.sendKeys(email);
		return this;
	}
	
	public ManageDeliveryBoyPage enterPhoneNumber(String phone)
	{
		phoneNumberField.sendKeys(phone);
		return this;
	}
	
	public ManageDeliveryBoyPage enterAddress(String address)
	{
		addressField.sendKeys(address);
		return this;
	}
	
	public ManageDeliveryBoyPage enterUsername(String username)
	{
		userNameField.sendKeys(username);
		return this;
		
	}
	
	public ManageDeliveryBoyPage enterPassword(String password)
	{
		passwordField.sendKeys(password);
		return this;
		
	}
	public ManageDeliveryBoyPage clickSaveButton()
	{
		saveButton.click();
		return this;
	}
	
	public boolean isalertresult()
	{
		return alert.isDisplayed();
	}
	
}
