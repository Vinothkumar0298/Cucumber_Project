package stepDefinitions;

import java.io.IOException;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ContactPage;
import pageObjects.LoginPage;
import pageObjects.Taskcreation;
import resources.Basepage;

public class StepDefinition extends Basepage{
	
	LoginPage login;
	Basepage base;
	ContactPage contact;
	Taskcreation taskpage;
	
	
	/*public StepDefinition() {
		super();
	}*/
	@Before()
	public void when_user_enter_the_URL() throws InterruptedException, IOException {
		
		
			}

	@Given("^Login page is loaded$")
	public void login_page_is_loaded() {
	   login=new LoginPage();
	   login.loginpageload();
	}
	
   @When("^User enters the (.+) and (.+) and logged in$")
	public void user_enters_the_username_and_password(String username, String password ) {
	   login.userlogin(username, password);
	}
    
    @When("^User enters the username and password and clicks on login$")
   	public void user_enters_the_username_and_password(DataTable credentials) {
    	List<Map<String, String>> data=(List<Map<String, String>>) credentials.asMaps();
    	for(int i=0;i<data.size();i++) 
    	{
    		String user=data.get(0).get("username");
    		String pass=data.get(0).get("password");
    		login.userlogin(user, pass);
    	}
    	
   	}
	
	@Then("^Home page is loaded for CRM$")
	public void home_page_is_loaded_for_CRM() throws InterruptedException {
		Thread.sleep(3000);
		login.homepagevalid();
	}

	@Then("^User moves to contacts page$")
	public void user_moves_to_contacts_page() throws InterruptedException {
	  contact=new ContactPage();
	  contact.contactpageopen();
	  Thread.sleep(2000);
	}

	@Then("^User creates new contacts with the details$")
	public void user_creates_new_contacts_with_the_details(DataTable details) throws InterruptedException {
		List<Map<String, String>> data=(List<Map<String, String>>) details.asMaps();
    	for(int i=0;i<data.size();i++) 
    	{
   	   String firstname=data.get(i).get("firstname");
   	   String lastname=data.get(i).get("Lastname");
   	   String mailid=data.get(i).get("email");
   	   String x= data.get(i).get("category");
   	   String role= data.get(i).get("text");
        contact.createnewcontact(firstname, lastname, mailid, x, role);
   	
    	}	
    	
	}
	
	@Then("^User moves to tasks page$")
	public void user_moves_to_tasks_page() throws InterruptedException {
	  taskpage=new Taskcreation();
	  taskpage.opentask();
	  Thread.sleep(2000);
	}
	
	@Then("^User creates new tasks with the details$")
	public void user_creates_new_tasks_with_the_details() {
	    
	}

	@After()
	public void user_closes_the_browser() {
	    driver.get().close();
	}
}
