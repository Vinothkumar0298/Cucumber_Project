package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.testng.Assert;

import resources.Basepage;

public class LoginPage extends Basepage{
	//WebDriver driver;
	@FindBy(css="a[href*='ui.freecrm']")
	WebElement LoginButton;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement Login;
	
	@FindBy(xpath="//span[text()='Nalini P']")
	WebElement HomePageValid;
	
	public LoginPage()
	{
		super();
		PageFactory.initElements(Basepage.driver.get(), this);
	}
	
	public void loginpageload()
	{
		LoginButton.click();
		String title=driver.get().getTitle();
		   System.out.println("Page title is:"+title);
		   Assert.assertEquals("Cogmento CRM", title);
	}
	
	public void userlogin(String user,String pass) {
		
   	   username.sendKeys(user);
   	   password.sendKeys(pass);
   	   Login.click();
	}
	
	public void homepagevalid() {
		System.out.println("Home page is displayed:"+HomePageValid.isDisplayed());	    
	  
	}
}
