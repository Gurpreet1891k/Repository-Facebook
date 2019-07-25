package com.test.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Qa.TestBaseDemo.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy (id="pass")
	WebElement password;
	
	@FindBy (xpath="//input[@value='LogIn']")
	WebElement LoginButton;
	
	@FindBy (xpath="//input[@name='firstname']")
	WebElement Firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement Lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
	WebElement EmailConfirm;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	WebElement Password;
	
	@FindBy(id="day")
	WebElement BirthDay;
	
	@FindBy(id="month")
	WebElement BirthMonth;
	
	@FindBy(id="year")
	WebElement BirthYear;
	
	@FindBy (name="sex")
	WebElement Gender;
	
	@FindBy (name="websubmit")
	WebElement SignUP;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogin()
	{
		userEmail.sendKeys("Admin");
		password.sendKeys("Admin");
	}
	
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	public void newuser()
	{
		Firstname.sendKeys("Gurpreet");
		Lastname.sendKeys("Kaur");
		Email.sendKeys("abc@yahoo.com");
		EmailConfirm.sendKeys("abc@yahoo.com");
		Password.sendKeys("qwerty@123");
		BirthDay.sendKeys("18");
		BirthMonth.sendKeys("oct");
		BirthYear.sendKeys("2000");
		Gender.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		SignUP.submit();	
	}
	
	public void fetchingLinks()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
	    System.out.println("Total number of links available on this page:" + li.size());
	    
	    for (int i = 0; i < li.size(); i++)
	    {
	      System.out.println(((WebElement)li.get(i)).getText());
	    }
	}
	
	public void fetchingImages()
	{
		List<WebElement> Img = driver.findElements(org.openqa.selenium.By.tagName("img"));
		System.out.println("Total number of images available on this page:" + Img.size());
		    
		for (int j = 0; j < Img.size(); j++)
		{
		  System.out.println(((WebElement)Img.get(j)).getAttribute("src")); }
		}
	}