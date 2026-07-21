package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import project.Base;
import utility.ExcelUtility;

public class LoginTest extends Base{
	HomePage hp;
	@Test(priority=1,description="User is trying to login with valid credentials",groups= {"Smoke"})
	public void verifyloginWithvalidCredentials() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage obj=new LoginPage(driver);
		obj.userName(userNameValue).password(passwordValue).remember();
		hp=obj.signIn();
		
		boolean dashboardresult=hp.isdashboardresult();
		Assert.assertTrue(dashboardresult, "USER IS UNABLE TO LOGIN WITH VALID CREDENTIALS");
		
	}
	
	@Test(priority=2,description="User is trying to login with invalid username")
	public void verifyloginWithInvalidUsernameandValidPassword() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage obj=new LoginPage(driver);
		obj.userName(userNameValue).password(passwordValue).signIn();
		String expected= "7rmart supermarket";
		String actual=obj.confirmLoginpagesStoreName();
		Assert.assertEquals(expected, actual,"User is able to Logged in with invalid username");
	}
	
	@Test(priority=3,description="User is trying to login with invalid password",groups= {"Smoke"} ,retryAnalyzer= retry.ReTry.class)
	public void verifyloginWithValidUsernameandInvalidPassword() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage obj=new LoginPage(driver);
		obj.userName(userNameValue).password(passwordValue).signIn();
		String expected= "7rmart supermarket";
		String actual=obj.confirmLoginpagesStoreName();
		Assert.assertEquals(expected, actual,"Logged in with invalid password");
	}
	
	@Test(priority=4,description="User is trying to login with invalid credentials",dataProvider="loginProvider")
	public void verifyloginWithInvalidCredentials(String userNameValue ,String passwordValue) throws IOException
	{
		//String userNameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
	   // String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage obj=new LoginPage(driver);
		obj.userName(userNameValue).password(passwordValue).signIn();
		String expected= "7rmart supermarket";
		String actual=obj.confirmLoginpagesStoreName();
		Assert.assertEquals(expected, actual,"Logged in with invalid username and password");
	}
	
	@DataProvider(name="loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException
	{
		return new Object[][] {new Object[] {"admin","admin22"},new Object[] {"admin123","123"},
	};
	}
	
	
}
