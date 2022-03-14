package com.sai;

import org.junit.Assert;
import org.junit.Test;

public class UserTest
{
	

		@Test
		/**
		 * created method testingFirstName() to check first name is valid or not
		 */
		public void testingFirstName() 
		{
			/**
			 * Creating Object for UserRegistration class
			 */
			User userRegistration = new User();
			/**
			 * calling checkFName method to see first name is valid
			 */
			boolean isFNameValid = userRegistration.checkFName("Saiprakash");
			Assert.assertTrue(isFNameValid);
		}

		@Test
		/**
		 * created method testFirstNameInvalidMustReturnFalse for false condition
		 */
		public void testFirstNameInvalidMustReturnFalse()
		{
			User us = new User();
			boolean isFnameValid = us.checkFName("Saiprakash");
			Assert.assertFalse(isFnameValid);
		}

}
