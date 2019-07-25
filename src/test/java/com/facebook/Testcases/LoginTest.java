package com.facebook.Testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.Qa.TestBaseDemo.TestBase;
import com.test.pages.LoginPage;

public class LoginTest extends TestBase{

	LoginPage loginPage;
	
	public  LoginTest()
	{
		super();
	}
	
	
	@BeforeSuite
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void verifyTitleTest()
	{
		String title =loginPage.verifyTitle();
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@Test
	public void verifyLoginTest()
	{
		loginPage.verifyLogin();
	}
	
	@Test
	public void newuserTest()
	{
		loginPage.newuser();
	}
	
	
	@Test
	public void fetchingLinksTest()
	{
		loginPage.fetchingLinks();
	}
	
	@Test
	public void fetchingImagesTest()
	{
		loginPage.fetchingImages();
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
