package com.Actproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.Baseclass;

public class Searchhotel extends Baseclass
{ 
	public static WebDriver driver;
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;

	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomtypes;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numberofrooms;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkindate;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkoutdate;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsperroom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childrensperroom;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement conti;




	public WebElement getradio() {
		return radio;
	}

	public WebElement getconti() {
		return conti;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtypes() {
		return roomtypes;
	}

	

	public WebElement getNumberofrooms() {
		return numberofrooms;
	}

	

	public WebElement getCheckindate() {
		return checkindate;
	}

	
	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	

	public WebElement getChildrensperroom() {
		return childrensperroom;
	}

	
	public WebElement getSearch() {
		return search;
	}

	public Searchhotel(WebDriver driver2)
	{
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

}
