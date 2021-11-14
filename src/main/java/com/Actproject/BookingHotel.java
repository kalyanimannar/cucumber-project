package com.Actproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement billingaddress;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement creditcardno;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditcardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expirydate;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expiryyear;
	
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvno;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement itinerary;
	
	@FindBy(xpath="(//input[@type='checkbox'])[6]")
	private WebElement radiobutton;
	
	@FindBy(xpath="//input[@name='logout']")
	private WebElement logout;


	
	public BookingHotel(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirydate() {
		return expirydate;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getItinerary() {
		return itinerary;
	}

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getLogout() {
		return logout;
	}

	
	

	
}



