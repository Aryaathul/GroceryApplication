package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import project.Base;
import utility.ExcelUtility;

public class ManageNewsTest extends Base {
	HomePage hp;
	ManageNewsPage mn;
	@Test
	public void verifyWhetherUserIsAbleToCreateNewNews() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp=new LoginPage(driver);
		lp.userName(userNameValue).password(passwordValue);
		hp=lp.signIn();
		mn=hp.manageNewsMoreInfoLink();
		String newNews=ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		mn.clickNewNewsButton().enterNewNews(newNews).clickNewNewsSaveButton();	
		boolean result=mn.isalertresult();
		Assert.assertTrue(result, "USER IS ABLE TO CREATE NEW NEWS");
	
	}
	
	@Test
	public void verifyWhetherUserIsAbleToSearchNewlyCreatedNews() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage lp=new LoginPage(driver);
		lp.userName(userNameValue).password(passwordValue);
		hp=lp.signIn();
		mn=hp.manageNewsMoreInfoLink();
		String newNews=ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		mn.clickSearchNewsButton().enterNewlyCreatedNews(newNews).clickNewNewsSearchBox();
		boolean result=mn.isdelDisplayed();
		Assert.assertTrue(result, "USER IS ABLE TO SEARCH NEWLY CREATED NEWS");
		
		
	}
}
