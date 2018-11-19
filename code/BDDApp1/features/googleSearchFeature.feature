Feature: Google Search Feature
Using this feature user can able to search very vital information

Scenario: User want to search information on 'Agile Methodlogy' by entering valid set of words
	Given User is on Google HomePage
	When User search for 'Agile Methodlogy'
	Then All links should display with 'Agile Methodlogy'
	
Scenario: User want to search pdf for 'Traffic Penalities' by entering valid set of words
	Given User is on Google HomePage
	When User search for 'Traffic Penalities PDF'
	Then All links should display pdf with 'Traffic Penalities'
	
Scenario: User want to search videos on 'GuptaJi Tinder Wale' by entering valid set of words
	Given User is on Google HomePage
	When User search for 'GuptaJi Tinder Wale'
	 Then All links should display videos with 'GuptaJi Tinder Wale'