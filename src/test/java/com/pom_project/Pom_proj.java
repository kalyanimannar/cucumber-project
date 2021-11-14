package com.pom_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Actproject.LoginPage;
import com.Actproject.POM_Class;
import com.BaseClass.Baseclass;

public class Pom_proj extends Baseclass
{
	
	public static void main (String[] args) throws InterruptedException 
	{
		browserLaunch("chrome");
		geturl("https://adactinhotelapp.com/");
		
        POM_Class pom = new POM_Class(driver);
		inputtext(pom.getlp().getEmail(),"kalyanikavi");
		inputtext(pom.getlp().getPass(),"zxcvb@12");
		clickonelement(pom.getlp().getButton());
		
		dropdownselection(pom.getsh().getLocation(),"text","Paris");
		dropdownselection(pom.getsh().getHotel(),"index","2");
		dropdownselection(pom.getsh().getRoomtypes(),"index","1");
		dropdownselection(pom.getsh().getNumberofrooms(),"index","2");

		clear(pom.getsh().getCheckindate());
		sleep(1000);
		inputtext(pom.getsh().getCheckindate(),"11/12/2021");
		clear(pom.getsh().getCheckoutdate());
		inputtext(pom.getsh().getCheckoutdate(),"20/12/2021");
		dropdownselection(pom.getsh().getAdultsperroom(),"index","1");
		dropdownselection(pom.getsh().getChildrensperroom(),"index","1");
		clickonelement(pom.getsh().getSearch());
		clickonelement(pom.getsh().getradio());
		clickonelement(pom.getsh().getconti());
		sleep(3000);
		
		inputtext(pom.getbh().getFirstname(),"Kalyani");
		inputtext(pom.getbh().getLastname(),"Mannar");
		inputtext(pom.getbh().getBillingaddress(),"chennai-49.");
		inputtext(pom.getbh().getCreditcardno(),"1234567891234567");
		dropdownselection(pom.getbh().getCreditcardtype(),"index","1");
		dropdownselection(pom.getbh().getExpirydate(),"index","5");
		dropdownselection(pom.getbh().getExpiryyear(),"index","3");
		inputtext(pom.getbh().getCvvno(),"234");
		clickonelement(pom.getbh().getBooknow());
		
		
		implicitwait();
		clickonelement(pom.getbh().getItinerary());
		sleep(1000);
	    clickonelement(pom.getbh().getRadiobutton());
	    sleep(1000);
		clickonelement(pom.getbh().getLogout());
		
		
		
		
		
		
		
	}

	
	

	
	
	
	
	
	
}