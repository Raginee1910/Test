package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	
	WebDriver driver;
	
	PageObjects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy( xpath = "//*[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath= "//*[@id='pass']")
	private WebElement passWord;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement login;
	
	
	public WebElement getUserName()
	{
		return userName;
		
	}
	
	public WebElement getPassWord() {
		return passWord;
		
	}
	
	public WebElement login() {
		return login;
		
	}
	
	
}
