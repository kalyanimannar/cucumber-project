package com.stepdefinition.com;

import org.openqa.selenium.WebDriver;

import com.Actproject.BookingHotel;
import com.Actproject.LoginPage;
import com.Actproject.Searchhotel;
import com.BaseClass.Baseclass;
import com.helper.com.FileReaderManager;
import com.runner.com.AdactinRunner;

import cucumber.api.java.en.*;

public class Adactin_Stepdefinition extends Baseclass
{  
	public static WebDriver driver = AdactinRunner.driver;

	
	LoginPage lp = new LoginPage(driver);
	Searchhotel sh = new Searchhotel(driver);
	BookingHotel bh = new BookingHotel(driver);
     
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
		//geturl("https://adactinhotelapp.com/");
		String url = FileReaderManager.getInstanceCR().getUrl();
		geturl(url);
	}

	

	@When("^user enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
		//inputtext(lp.getEmail(),"kalyanikavi");
		String username = FileReaderManager.getInstanceCR().getUsername();
		inputtext(lp.getEmail(),username);
		
	}

	@When("^user enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
	
		//inputtext(lp.getPass(),"zxcvb@12");
		String password =FileReaderManager.getInstanceCR().getpassword();
		inputtext(lp.getPass(),password);
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickonelement(lp.getButton());
	}

	
	

		@Given("^User search for the hotel in the application$")
		public void user_search_for_the_hotel_in_the_application() throws Throwable {
		    
		}

		@When("^user select the location in the location field$")
		public void user_select_the_location_in_the_location_field() throws Throwable {
			dropdownselection(sh.getLocation(),"text","Paris");

		}

		@When("^user select the hotel in hotel field$")
		public void user_select_the_hotel_in_hotel_field() throws Throwable {
			dropdownselection(sh.getHotel(),"index","2");

		}

		@When("^user select the room type in the room type field$")
		public void user_select_the_room_type_in_the_room_type_field() throws Throwable {
			dropdownselection(sh.getRoomtypes(),"index","1");
		}

		@When("^user select the no of rooms in the no of rooms field$")
		public void user_select_the_no_of_rooms_in_the_no_of_rooms_field() throws Throwable {
			dropdownselection(sh.getNumberofrooms(),"index","2");

		}

		@When("^user select the check in date in check in date field$")
		public void user_select_the_check_in_date_in_check_in_date_field() throws Throwable {
			clear(sh.getCheckindate());
			inputtext(sh.getCheckindate(),"11/12/2021");
		}

		@When("^user select the check out date in the check out date field$")
		public void user_select_the_check_out_date_in_the_check_out_date_field() throws Throwable {
			clear(sh.getCheckoutdate());
			inputtext(sh.getCheckoutdate(),"20/12/2021");
		}


		@When("^user select the adults per room in the adults per room field$")
		public void user_select_the_adults_per_room_in_the_adults_per_room_field() throws Throwable {
			dropdownselection(sh.getAdultsperroom(),"index","1");

		}

		@When("^user select the children per room in the children per room field$")
		public void user_select_the_children_per_room_in_the_children_per_room_field() throws Throwable {
			dropdownselection(sh.getChildrensperroom(),"index","1");

		}

		@Then("^user clicks the search button$")
		public void user_clicks_the_search_button() throws Throwable {

			clickonelement(sh.getSearch());
			clickonelement(sh.getradio());
			clickonelement(sh.getconti());
		}

		
		@Given("^User enter the valid first name in the name field$")
		public void user_enter_the_valid_first_name_in_the_name_field() throws Throwable {
			inputtext(bh.getFirstname(),"Kalyani");
		}

		@Given("^User enter the last name in the last name field$")
		public void user_enter_the_last_name_in_the_last_name_field() throws Throwable {

			inputtext(bh.getLastname(),"Mannar");
		}

		@Given("^user enter the billing address in the billingaddress field$")
		public void user_enter_the_billing_address_in_the_billingaddress_field() throws Throwable {

			inputtext(bh.getBillingaddress(),"chennai-49.");
		}

		@Given("^user the valid credit card no in the credit card field$")
		public void user_the_valid_credit_card_no_in_the_credit_card_field() throws Throwable {
			//inputtext(bh.getCreditcardno(),"1234567891234567");
			String cardno = FileReaderManager.getInstanceCR().getcardno();
			inputtext(bh.getCreditcardno(),"1234567891234567");
		}

		@Given("^user enter the valid credit card type in the credit card field$")
		public void user_enter_the_valid_credit_card_type_in_the_credit_card_field() throws Throwable {
			dropdownselection(bh.getCreditcardtype(),"index","1");
		}

		@Given("^user enter the expiry date  month in the expiry date field$")
		public void user_enter_the_expiry_date_month_in_the_expiry_date_field() throws Throwable {
			dropdownselection(bh.getExpirydate(),"index","5");
		}

		@Given("^user enter the expiry date year in the expiry year field$")
		public void user_enter_the_expiry_date_year_in_the_expiry_year_field() throws Throwable {
			dropdownselection(bh.getExpiryyear(),"index","3");
		}

		@Given("^user enter the cvv no in the cvv field$")
		public void user_enter_the_cvv_no_in_the_cvv_field() throws Throwable {
			//inputtext(bh.getCvvno(),"234");
			String cvv = FileReaderManager.getInstanceCR().getcvv();
			inputtext(bh.getCvvno(),cvv);
		}

		@Then("^user clicks the booknow button$")
		public void user_clicks_the_booknow_button() throws Throwable {
			clickonelement(bh.getBooknow());
			implicitwait();
			clickonelement(bh.getItinerary());
			sleep(1000);
		    clickonelement(bh.getRadiobutton());
		    sleep(1000);
			clickonelement(bh.getLogout());
			
			
		}




	
	
	
	
	
	
	
	
	
	
}
