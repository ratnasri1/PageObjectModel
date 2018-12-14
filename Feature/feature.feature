Feature: Home page is the first page of the application 
Scenario: This scenario is to validate the home page display
		Given Launch the firefox browser
		|http://automationpractice.com/index.php|
		When click on dresses option and text should display
		Then verify dresses page text displayed

Scenario: This scenario is to validate the dresses page menu
		Given Dresses menu opened and menus are present
		And displayed all sub menu should be in oredered way
		Then Verify dresses sub menu links.
		
Scenario: This scenario is to validate the dresses page checkboxes
		Given Dresses menu should display sub menus in that dispaly how many checkboxes
		And in catagerioes click on casual dresses, evening dresses,Summerdresses checkboxes
		Then Verify checkboxes are clicked or not in the catagories.