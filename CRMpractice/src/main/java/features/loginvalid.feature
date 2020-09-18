Feature: CRM website validation

Scenario Outline: Login page validation
Given when user enter the URL
When Login page is loaded
Then User enters the <username> and <password> and logged in
Then Home page is loaded for CRM
Then User closes the browser

Examples:
 | username | password |
 | nalini.maaya@gmail.com  | SujRam@1893 |
 
Scenario: Create contact validation 
	Given when user enter the URL 
	When Login page is loaded 
	Then User enters the username and password and clicks on login
		| username | password |
		| nalini.maaya@gmail.com  | SujRam@1893 | 
	Then Home page is loaded for CRM 
	Then User moves to contacts page  
	Then User creates new contacts with the details 
		| firstname | Lastname | email | category | text |
		| Vinod | K | peddi@gmail.com | 2 | Lead |
		| Nalini1 | Pe | peddine@gmail.com | 4 | Contact |
	Then User closes the browser	
		
Scenario: Create Task validation
Given when user enter the URL 
	When Login page is loaded 
	Then User enters the username and password and clicks on login
		| username | password |
		| nalini.maaya@gmail.com  | SujRam@1893 |
    Then Home page is loaded for CRM 
	Then User moves to tasks page  
	Then User creates new tasks with the details 