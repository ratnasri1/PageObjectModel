Feature: Home page is the first page of the application
Background:
    Given Launch "FireFox" Browser and load Url
		|http://automationpractice.com/index.php|
@sc1		
 Scenario: User should able to register using valid email address
 		When the page is launch check signin option and click and verify the create account header
		Then enter the valid email address in create account page and click on create account button to navigate to register page
		|kittu12345@gmail.com|
		Then click on gender radio button
		|Mr|
		Then verify register page personal details elements First name,Lastname,Email, password,Date of Birth elements and chcekboxes
		|kittu|sri|Kittu12!|
		Then verify your address elements First name,Lastname, company and address
		|ABCD|201,PO|201,PO|
		Then verify City,State,Zip/Postal Code,Country elements
		|NewYork|06606|
		Then verify Additional information,Home phone,Mobile phone,Assign an address alias for future reference elements
		|ABCDEF|0404040000|1234567890|My address|
		Then verify the details entered in register page and click on register
		
	

Scenario: This scenario is to validate While registering, if the email address is incorrect. User should see an
error message
		
		And validate the registered email address with incorrect email addresses
		|rar@gmail.com|
		|kittu145@gmail.com|
		|vkittu123@gmail.com|
		|1235@gmail.com|
		|12345|
		Then verify error message is showned when the email address is incorrect
		But the email address is already registered
		Then verify the popup message, email address is already exist
		
		
Scenario: This scenario is to validate whether Megamenu works (Dresses -> Summer dresses)
		
		When MegaMenu page is open
		And validate the Dresses page which having submenu Summer dresses
		Then Verify Dresses page and its sub menu Summer dresses