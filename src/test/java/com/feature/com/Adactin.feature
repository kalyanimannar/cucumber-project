Feature: Check the functions of adactin hotel application


Scenario: User checks the login page using  valid username and password
Given  user launch the application
When user enter the valid username in the username field
And user enter the valid password in the password field
Then User clicks on the login button


Scenario: User search for the hotel using the information
Given User search for the hotel in the application
When user select the location in the location field
And user select the hotel in hotel field
And user select the room type in the room type field
And user select the no of rooms in the no of rooms field
And user select the check in date in check in date field
And user select the check out date in the check out date field
And user select the adults per room in the adults per room field
And user select the children per room in the children per room field
Then user clicks the search button

Scenario: User booking the room and does payment
Given User enter the valid first name in the name field
And User enter the last name in the last name field
And user enter the billing address in the billingaddress field
And user the valid credit card no in the credit card field
And user enter the valid credit card type in the credit card field
And user enter the expiry date  month in the expiry date field
And user enter the expiry date year in the expiry year field
And user enter the cvv no in the cvv field
Then user clicks the booknow button