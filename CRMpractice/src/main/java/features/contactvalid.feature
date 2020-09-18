Feature: CRM website validation 

@Smoketest
Scenario Outline: Login page validation 
	Given Login page is loaded 
	When User enters the <username> and <password> and logged in 
	Then Home page is loaded for CRM 
	
	Examples: 
		| username | password |
		| nalini.maaya@gmail.com  | SujRam@1893 |

@Functionaltest @Smoketest		
Scenario: Create contact validation 
	Given Login page is loaded 
	When User enters the username and password and clicks on login 
		| username | password |
		| nalini.maaya@gmail.com  | SujRam@1893 | 
	Then Home page is loaded for CRM 
	Then User moves to contacts page 
	Then User creates new contacts with the details 
		| firstname | Lastname | email | category | text |
		| Vinod | K | peddi@gmail.com | 2 | Lead |
		| Nalini1 | Pe | peddine@gmail.com | 4 | Contact | 

@Functionaltest @Smoketest	
Scenario: Create Task validation 
	Given Login page is loaded 
	When User enters the username and password and clicks on login 
		| username | password |
		| nalini.maaya@gmail.com  | SujRam@1893 |
	Then Home page is loaded for CRM 
	Then User moves to tasks page 
	Then User creates new tasks with the details 