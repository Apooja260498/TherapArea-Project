Feature: Test all functionality of admin panel

Scenario: Test admin successfully login with valid username and password

	Given Browser launch successfully and open Url
	When enter valid username and password
	Then click on Login button 
	And check login successfully messasge 
	
Scenario: Test admin get error message with invalid username and password
	
	Given Browser launch successfully and open Url
	When enter Invalid username and password
	Then click on Login button 
	And check error  messasge  visible
	


