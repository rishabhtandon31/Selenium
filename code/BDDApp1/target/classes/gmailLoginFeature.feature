Feature: GMail Login Feature
Using this feature user can able to login to GMail Account
Scenario: User want to login to GMail Account by adding valid login credentials
	Given User is on GMail Login Page
	When User enters the login credentials
	And User clicks on Login Button
	Then User is logged in to GMail Account
	
