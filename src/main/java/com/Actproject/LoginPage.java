package com.Actproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage 
{
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement button;
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}
    public WebElement getButton() {
		return button;
	}

	public LoginPage(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
