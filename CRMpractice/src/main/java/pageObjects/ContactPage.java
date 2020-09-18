package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Basepage;

public class ContactPage extends Basepage{
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement Contacts;
	
	@FindBy(xpath="//div[text()='Contacts']")
	WebElement Contactsvalid;
	
	@FindBy(xpath="//div[@class='item']/a")
	WebElement newbutton;
	
	@FindBy(name="first_name")
	WebElement ContactFname;
	
	@FindBy(name="last_name")
	WebElement ContactLname;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement ContactEmail;
	
	@FindBy(name="category")
	WebElement Category;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement ContactSave;
	
	public ContactPage()
	{
		super();
		PageFactory.initElements(driver.get(), this);
	}
	
	public void contactpageopen() {
		Contacts.click();
		System.out.println("Contacts page is displayed:"+Contactsvalid.isDisplayed());
	}
	
	public void createnewcontact(String fname,String lname,String email,String index,String role) throws InterruptedException {
		newbutton.click();
		ContactFname.sendKeys(fname);
		ContactLname.sendKeys(lname);
		ContactEmail.sendKeys(email);
		Category.click();
		String xpath="//div[@class='visible menu transition']/div[" + index + "]/span[text()='"+role+"']";
		driver.get().findElement(By.xpath(xpath)).click();
	   	ContactSave.click();
	   	Thread.sleep(2000);
	   	contactpageopen();
	}
	/*
    driver.findElement(By.xpath("//div[@class='item']/a")).click();
   	   driver.findElement(By.name("first_name")).sendKeys(data.get(i).get("firstname"));
   	   driver.findElement(By.name("last_name")).sendKeys(data.get(i).get("Lastname"));
   	   driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(data.get(i).get("email"));
   	   driver.findElement(By.name("category")).click();
   	   String x= data.get(i).get("category");
   	   String role= data.get(i).get("text");
   	   String xpath="//div[@class='visible menu transition']/div[" + x + "]/span[text()='"+role+"']";
   	   driver.findElement(By.xpath(xpath)).click();
   	   driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
   	
   	driver.findElement(By.xpath("//span[text()='Contacts']")).click();
   	*/
}
