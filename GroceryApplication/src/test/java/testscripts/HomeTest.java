package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import project.Base;
import utility.ExcelUtility;


public class HomeTest extends Base{
	
	HomePage obj;
	@Test(description="User is trying to logout")
	public void verifyUserIsAbleTologout() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage obj1=new LoginPage(driver);
		obj1.userName(userNameValue).password(passwordValue).remember();
	    obj=obj1.signIn();
		obj.clickAdminButton();
		obj1=obj.logoutButton();
		boolean result=obj1.isTextDisplayed();
		Assert.assertTrue(result,Constant.LOGOUTERROR);
		
	}
	
	
}
