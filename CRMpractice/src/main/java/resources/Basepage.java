package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Basepage {
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
public ThreadLocal<RemoteWebDriver> initializeDriver() throws IOException, InterruptedException
{

//if(browserName.equals("chrome"))
//{
	 System.setProperty("webdriver.chrome.driver", "C://HCL_sample_Project//Drivers//chromedriver.exe");
	
	 
		//execute in chrome driver
/*	
}
else if (browserName.equals("firefox"))
{*/
	
//	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Home\\Downloads\\geckodriver.exe");
//	driver = new FirefoxDriver();
	
/*else if (browserName.equals("IE"))
{
	System.setProperty("webdriver.ie.driver", "C:\\Downloads\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	driver.navigate().to("javascript:document.getElementById('overridelink').click()");
}*/

	
return driver;

}

public void screenshot(WebDriver driver,String filepath) throws IOException {
	TakesScreenshot scrn=(TakesScreenshot)driver;
	File src=scrn.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File(filepath));
	
}

}
