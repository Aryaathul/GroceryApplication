package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//logout
	
	@FindBy(partialLinkText="Admin")WebElement adminButton;
	@FindBy(partialLinkText="Logout")WebElement logoutButton;
	
	//moreinfo-AdminUsers
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminUsersMoreInfo;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	
	//moreinfo-ManageUsers
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class=' nav-link']") WebElement manageUsersMoreInfo;
	
	//moreinfo- managenews
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement manageNewsMoreInfoLink;
	
	//moreinfo-manage delivery boy page
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy' and @class='small-box-footer']") WebElement moreInfoManageDeliveryBoy;
	
	public HomePage clickAdminButton()
	{
		adminButton.click();
		return this;
	}
	
	
	
	public LoginPage logoutButton()
	{
	
	logoutButton.click();
	return new LoginPage(driver);
		
	}
	public AdminUsersPage adminUsersMoreInfoLink()
	{
		adminUsersMoreInfo.click();
		return new AdminUsersPage(driver);
	}
	
	public boolean isdashboardresult()
	{
		return dashboard.isDisplayed();
	}
	
	public ManageContactPage manageUsersMoreInfoLink()
	{
		manageUsersMoreInfo.click();
		return new ManageContactPage(driver);
	}
	
	public ManageNewsPage manageNewsMoreInfoLink()
	{
		manageNewsMoreInfoLink.click();
		return new ManageNewsPage(driver);
	}
	
	public ManageDeliveryBoyPage manageDeliveryBoyPageMoreInfoLink()
	{
		moreInfoManageDeliveryBoy.click();
		return new ManageDeliveryBoyPage(driver);
	}
	
}
