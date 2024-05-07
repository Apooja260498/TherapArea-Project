Feature: Login

Scenario:successfully login woth valid credentials
Given browser launch successfully
When user enter valid email addess
And valid password
And click on login button
Then dashboard page should be open
And patient should be able to scedule appointment 
And appointment button is clickable or not

