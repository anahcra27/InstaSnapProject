package com.Ecommerce.InstaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
@BeforeClass
public void BrowserSetup()
{
	Reporter.log("browser launched succesfully", true);
}
@BeforeMethod
public void login()
{
	Reporter.log("login succesful", true);
}
@AfterMethod
public void logout()
{
	Reporter.log("logut succesful", true);
}
@AfterClass
public void TerminateBrowser()
{
	Reporter.log("browser launched succesfully", true);
}

}
