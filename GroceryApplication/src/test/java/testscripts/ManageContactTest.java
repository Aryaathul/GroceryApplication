package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import project.Base;
import utility.ExcelUtility;
import utility.RandomDataUtility;

public class ManageContactTest extends Base {

		HomePage hp;
		ManageContactPage  mp;
		@Test
		public void verifyWhetherUserIsAbleToUpdateTheContactMethod() throws IOException
		{
			String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
			String passwordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
			LoginPage lp=new LoginPage(driver);
			lp.userName(userNameValue).password(passwordValue);
			hp=lp.signIn();
			hp.manageUsersMoreInfoLink();
			RandomDataUtility rd=new RandomDataUtility();
			String newPhoneNum=rd.mobnumber();
			String newEmail=rd.emailid();
			String newAddress=rd.address();
			mp.manageContactAction().enterPhoneNumber(newPhoneNum).enterEmail(newEmail).enterAddress(newAddress).updateInfo();
			//boolean alert=mp.isalertresult();
			//Assert.assertTrue(alert, "USER IS ABLE TO UPDATE THE CONTACT METHOD");
					
		}
}
