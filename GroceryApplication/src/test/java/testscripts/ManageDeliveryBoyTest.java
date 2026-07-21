package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageDeliveryBoyPage;
import project.Base;
import utility.ExcelUtility;
import utility.RandomDataUtility;

public class ManageDeliveryBoyTest extends Base {
	HomePage hp;
	ManageDeliveryBoyPage db;
	@Test(description="User is trying to create new user in manage deliver boy page")
	public void verifyWhetherUserIsAbleToCreatenewUserInfo() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		lp.userName(userNameValue).password(passwordValue).remember();
		hp=lp.signIn();
		db=hp.manageDeliveryBoyPageMoreInfoLink();
		db.newButtonClick();
		RandomDataUtility rd= new RandomDataUtility();
		db.enterName(rd.fullname()).enterEmail(rd.emailid()).enterPhoneNumber(rd.mobnumber()).enterAddress(rd.address()).enterUsername(rd.randomusername()).enterPassword(rd.randompassword()).clickSaveButton();
		boolean alertresult=db.isalertresult();
		Assert.assertTrue(alertresult, "USER IS UNABLE CREATE NEW USER INFO");
		
	}
}
