package com.Actproject;

import org.openqa.selenium.WebDriver;

public class POM_Class 
{
	WebDriver driver;
	
	private LoginPage lp;
	private Searchhotel sh;
	private BookingHotel bh;
	
	public POM_Class(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	public LoginPage getlp()
	{
		lp=new LoginPage(driver);
		return lp;
		
	}
 
	public Searchhotel getsh()
	{
		sh = new Searchhotel(driver);
		return sh;
		
	}
	
	public BookingHotel getbh()
	{
		bh = new BookingHotel(driver);
		return bh;
	}
}