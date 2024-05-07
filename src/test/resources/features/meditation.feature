Feature: Meditation program

Scenario: If therapist assign program to patient then this program is visible in patient panel or not

	Given launch browser and open URL successfully
	When click on meditation in therapist panel
	And create new program 
	And assign it to patient
	
Scenario: patient able to purchase program

	Given Launch Browser and open url successfully
	When click on meditation in patient panel
	Then check assign program visible or not


