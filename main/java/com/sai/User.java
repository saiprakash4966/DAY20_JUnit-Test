package com.sai;

import org.junit.Test;

public class User 
{
	
	/**
	 * created method checkFName and passing parameter in this it will check
	 * FirstName is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param fName -FirstName of the String
	 * @return -return to method created
	 */
	public boolean checkFName(String fName)
	{
		/**
		 * RegEx pattern for FirstName
		 */
		return (fName.matches("[A-Z][a-z]{3,}"));

	}

	/**
	 * created method L name and passing parameter in this it will check LastName is
	 * valid or not result will be in true or false because method is boolean type
	 * 
	 * @param Lname -LastName of the String
	 * @return - return to method created
	 */
	public boolean Lname(String Lname) 
	{
		return (Lname.matches("[A-Z][a-z]{3,}"));
	}
	/**
	 * created method checkEmail and passing parameter in this it will check Email
	 * is valid or not result will be in true or false because method is boolean
	 * type
	 * 
	 * @param emailID -passing emailId
	 * @return -return to method created
	 */
	public boolean checkEmail(String emailID) 
	{
		return (emailID.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
	}
	@Test
	/**
	 * created testPhoneNumber_MustReturnFalse() for False condition
	 */
	/**
	 * created method checkPhoneNum and passing parameter in this it will check
	 * phoneNumber is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param phoneNum -passing phoneNumber
	 * @return -return to method created
	 */
	public boolean checkPhoneNum(String phoneNum)
	{
		return (phoneNum.matches("91\\s[0-9]{10}"));
	}
	/**
	 * created method checkPassword and passing parameter in this it will check
	 * Password is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param password- passing password
	 * @return -return to method created
	 */
	public boolean checkPassword(String password)
	{
		return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
	}
}
