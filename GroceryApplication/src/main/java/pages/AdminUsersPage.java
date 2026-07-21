package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.PageUtility;

public class AdminUsersPage {
	
public WebDriver driver;

    PageUtility pg=new PageUtility();
	
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		//creating new username and password
	    @FindBy(linkText="New")WebElement newButton;
		@FindBy(id="username") WebElement newUsername;
		@FindBy(id="password")WebElement newPassword;
		@FindBy(id="user_type") WebElement userType;
		@FindBy(name="Create")WebElement saveButton;
		
		
		//search newly created user
		@FindBy(xpath="//a[@href='javascript:void(0)']/i[@class=' fa fa-search']") WebElement search;
		@FindBy(id="un")WebElement searchUsernamefield;
		@FindBy(xpath="//select[@id='ut']") WebElement selectUserTypeForSearch;
		@FindBy(xpath="//button[@name='Search']")WebElement searchForNewlyAddedUser;
	
	    //ASSERTION TO VERIFY USER IS CREATED SUCCESSFULLY
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
		
		 //ASSERTION TO VERIFY USER IS ABLE TO SEARCH NEWLY CREATED USER
		@FindBy(xpath="//span[@class='badge bg-success']")WebElement status;
	
	

	
	public AdminUsersPage clickNewButton()
	{
		newButton.click();
		return this;
	}
	public AdminUsersPage newUserUsernameCreation(String newUsernameValue)
	{
		newUsername.sendKeys(newUsernameValue);
		return this;
	}
	
	public AdminUsersPage newUserPasswordCreation(String newPasswordValue)
	{
		newPassword.sendKeys(newPasswordValue);
		return this;
	}
	
	public AdminUsersPage selectUserType()
	{
		pg.selectDropdownWithValue(userType,"staff");
		//Select obj1= new Select(userType);
		//obj1.selectByValue("staff");
		return this;
	}
	
	
	
	public AdminUsersPage saveUser()
	{
		saveButton.click();
		return this;
	}
	
	public AdminUsersPage searchUser()
	{
		search.click();
		return this;
	}
	
	public AdminUsersPage enterUsernameField(String newUsernameValue)
	{
		searchUsernamefield.sendKeys(newUsernameValue);
		return this;
	}
	
	public AdminUsersPage selectUserTypeForSearch()
	{
		pg.selectDropdownWithIndex(selectUserTypeForSearch, 1);
	//	Select obj=new Select(selectUserTypeForSearch);
		//obj.selectByIndex(1);
		return this;
	}
	

	public AdminUsersPage searchForNewlyAddedUser()
	{
		searchForNewlyAddedUser.click();
		return this;
	}
	
	public boolean isalertDisplayed()
	{
		return alert.isDisplayed();
	}
	
	public boolean isStatusDisplayed()
	{
		return status.isDisplayed();
	}
}

