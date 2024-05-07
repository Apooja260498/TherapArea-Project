Feature: edit business details

Scenario: Therapist able to edit business details.

	Given Launch browser successfully
	When click on edit profile
	And click on business details
	Then edit business details
 	
 	
Scenario:Business details should be visible in same therapist in admin panel

	Given Launch browser successfully 
	And Login admin panel
	When click on therapist
	Then check business details visible or not
