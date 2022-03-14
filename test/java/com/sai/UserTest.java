package com.sai;

import org.junit.Assert;
import org.junit.Test;

public class UserTest
{

	@Test
	/**
	 * created method testingFirstName() to check first Name is valid or not
	 */
	public void testingFirstName()
	{
		/**
		 * Creating Object for UserRegistration class
		 */
		User us = new User();
		/**
		 * calling checkFName method to see first Name is valid
		 */
		boolean isFNameValid = us.checkFName("Saiprakash");
		Assert.assertTrue(isFNameValid);
	}

	@Test
	/**
	 * created method testFirstNameInvalidMustReturnFalse for false condition
	 */
	public void testFirstNameInvalidMustReturnFalse() 
	{
		User userRegistration = new User();
		boolean isFnameValid = userRegistration.checkFName("saiprakash");
		Assert.assertFalse(isFnameValid);
	}

	/**
	 * created method testingLastName() to check last Name is valid or not
	 */
	@Test
	public void testLastNameValidMustReturnTrue() 
	{
		User user = new User();
		/**
		 * calling L name method to see LastName is valid
		 */
		boolean isLnameValid = user.Lname("Beemari");
		Assert.assertTrue(isLnameValid);
	}

	/**
	 * created method testLastNameInvalidMustReturnFalse for false condition
	 */
	@Test
	public void testLastNameValidMustReturnFalse() 
	{
		User us = new User();
		boolean isLnameINValid = us.Lname("beemari");
		Assert.assertFalse(isLnameINValid);
	}
	@Test
	/**
	 * created method testEmailId_MustReturnTrue() for true condition
	 */
    public void testEmailId_MustReturnTrue()
	{
        User userRegistration = new User();
        /**
		 * calling checkEmail method to see mailId is valid
		 */
        boolean isEmailValid = userRegistration.checkEmail("almas.ab@gmail.com");
        Assert.assertTrue(isEmailValid);
    }

    @Test
    /**
	 * created method testEmailId_MustReturnFalse() for false condition
	 */

    public void testEmailId_MustReturnFalse() 
    {
        User us = new User();
        boolean isEmailInvalid = us.checkEmail("almas@.com");
        Assert.assertFalse(isEmailInvalid);
    }
    @Test
	/**
	 * created testPhoneNumber_MustReturnTrue() for True condition
	 */
	public void testPhoneNumber_MustReturnTrue() {
		User us = new User();
		/**
		 * calling checkPhoneNum method to see phoneNumber is valid
		 */
		boolean isPhoneNumberValid = us.checkPhoneNum("91 9676113169");
		Assert.assertTrue(isPhoneNumberValid);
	}

	@Test
	/**
	 * created testPhoneNumber_MustReturnFalse() for False condition
	 */
	public void testPhoneNumber_MustReturnFalse()
	{
		User us = new User();
		boolean isPhoneNumberInValid = us.checkPhoneNum("9676113169");
		Assert.assertFalse(isPhoneNumberInValid);
	}
	@Test
	/**
	 * created testPassword_MustReturnTrue() for True condition
	 */
	public void testPassword_MustReturnTrue()
	{
		User us = new User();
		/**
		 * calling checkPassword method to see Password is valid
		 */
		boolean isPasswordValid = us.checkPassword("Saishiva");
		Assert.assertTrue(isPasswordValid);
	}

	@Test
	/**
	 * created testPassword_MustReturnFalse() for False condition
	 */
	public void testPassword_MustReturnFalse() 
	{
		User us = new User();
		boolean isPasswordInValid = us.checkPassword("saishiva");
		Assert.assertFalse(isPasswordInValid);
	}
}