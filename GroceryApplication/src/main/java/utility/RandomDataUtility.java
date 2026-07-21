package utility;

import com.github.javafaker.Faker;

public class RandomDataUtility {
	
	
		Faker obj = new Faker();
		
		public String randomusername()
		{
			return obj.name().username();
		}
		
		public String randompassword()
		{
			return obj.internet().password();
		}
		
		public String fullname()
		{
			return obj.name().fullName();
		}
		
		public String emailid()
		{
			return obj.internet().emailAddress();
		}
		
		public String mobnumber()
		{
			return obj.phoneNumber().cellPhone();
		}
		
		public String address()
		{
			return obj.address().fullAddress();
		}
	}

