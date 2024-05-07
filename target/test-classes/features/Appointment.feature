Feature: Appointment

Scenario: Verify patient able to click appointment

	Given browser launch successfully
 	When patient click on appointment 
 	Then patient able to see appoinment
 
Scenario: Verify patient able to click payment 

	Given browser launch successfully
	When click on payment
	Then check payment should be visible
	
Scenario: Verify meditation button clickable

	Given browser launch successfully
	When click on meditation
	Then therapist program us visible 
	



