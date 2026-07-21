package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import project.Base;
import utility.ExcelUtility;
import utility.RandomDataUtility;

public class AdminUsersTest extends Base {
	HomePage hp;
	AdminUsersPage ap;
	@Test(description="User is trying to add new Admin user")
	public void verfifyWhetherUserisAbleToAddNewAdminUser() throws IOException
	{
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		RandomDataUtility rd=new RandomDataUtility();
		String newUserNameValue=rd.randomusername();
		String newPasswordValue=rd.randompassword();
		LoginPage lp=new LoginPage(driver);
		lp.userName(userNameValue).password(passwordValue);
		hp=lp.signIn();
		ap=hp.adminUsersMoreInfoLink();
		ap.clickNewButton().newUserUsernameCreation(newUserNameValue).newUserPasswordCreation(newPasswordValue).selectUserType().saveUser();
		boolean alertResult=ap.isalertDisplayed();
		Assert.assertTrue(alertResult,"USER IS UNABLE CREATE NEW USER INFO");
	}
	
	@Test(description="User is trying to search newly added user")
	public void verifyWhetherUserIsAbleToSearchNewlyAddedUser() throws IOException
	{
		
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		String newUserNameValue=ExcelUtility.getStringData(0, 0, "AdminUserPage");
		String newPasswordValue=ExcelUtility.getStringData(0, 1, "AdminUserPage");
		LoginPage lp=new LoginPage(driver);
		lp.userName(userNameValue).password(passwordValue);
		hp=lp.signIn();
		ap=hp.adminUsersMoreInfoLink();
		ap.searchUser().enterUsernameField(newUserNameValue).selectUserTypeForSearch().searchForNewlyAddedUser();	
		boolean statusResult=ap.isStatusDisplayed();
		Assert.assertTrue(statusResult,"USER IS UNABLE TO SEARCH NEW USER INFO");
		
	}
}
