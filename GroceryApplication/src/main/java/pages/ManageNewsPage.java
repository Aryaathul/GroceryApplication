package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	public WebDriver driver;
	
	public ManageNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add' and @class='btn btn-rounded btn-danger']")WebElement newNewsButton;
	@FindBy(name="news") WebElement newNewsTextBox;
	@FindBy(name="create")WebElement newNewsSaveButton;
	
	//searchnewnes
	@FindBy(xpath="//a[@href='javascript:void(0)' and @class='btn btn-rounded btn-primary']")WebElement searchNewsButton;
	@FindBy(name="un")WebElement newlyNewsTextBox;
	@FindBy(name="Search")WebElement newNewsSearchBox;	
	
	//check assertion
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-danger btncss']") WebElement deleteOption;
	
	
	public ManageNewsPage clickNewNewsButton() 
	{
		newNewsButton.click();
		return this;
	}
	
	public ManageNewsPage enterNewNews(String newNews)
	{
		newNewsTextBox.sendKeys(newNews);
		return this;
	}
	
	public ManageNewsPage clickNewNewsSaveButton()
	{
		newNewsSaveButton.click();
		return this;
	}
	
	public ManageNewsPage clickSearchNewsButton()
	{
		 searchNewsButton.click();
		 return this;
	}
	
	public ManageNewsPage enterNewlyCreatedNews(String newNews )
	{
		newlyNewsTextBox.sendKeys(newNews);
		return this;
	}
	
	public ManageNewsPage clickNewNewsSearchBox()
	{
		newNewsSearchBox.click();
		return this;
	}
	
	public boolean isalertresult()
	{
		return alert.isDisplayed();
	}
	
	public boolean isdelDisplayed()
	{
		return  deleteOption.isDisplayed();
	}
	
	

}
