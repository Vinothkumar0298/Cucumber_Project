package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Basepage;

public class Taskcreation extends Basepage{

	@FindBy(xpath="//span[@class='item-text'][text()='Tasks']")
	WebElement taskbutton;
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']/div[1]")
	WebElement Taskpagevalid;
	
	public Taskcreation()
	{
		super();
		PageFactory.initElements(driver.get(), this);
	}
	
	public void opentask() {
		taskbutton.click();
		System.out.println("Task page is displayed:"+Taskpagevalid.isDisplayed());
	}
}
