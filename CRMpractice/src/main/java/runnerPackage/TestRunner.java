package runnerPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Basepage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



				
@CucumberOptions(features="src/main/java/features/contactvalid.feature",glue={"stepDefinitions"},
plugin={"pretty", "html:output.html","json:json_output/out.json"},
dryRun=false,monochrome=true,
tags= {"@Smoketest"}
)					

public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @SuppressWarnings("unused")
    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        // the 'featureWrapper' parameter solely exists to display the feature file in a test report
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    /**
     * Returns two dimensional array of {@link PickleWrapper}s
     * with their associated {@link FeatureWrapper}s.
     *
     * @return a two dimensional array of scenarios features.
     */
    @DataProvider(parallel=true)
    public Object[][] scenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }
    @BeforeMethod
    
    public void beforeMethodinit() throws MalformedURLException{
    	//System.setProperty("webdriver.chrome.driver", "C://HCL_sample_Project//Drivers//chromedriver.exe");
    	
    	DesiredCapabilities chromeOptions = new DesiredCapabilities().chrome();
    	//chromeOptions.setCapability("browserVersion", "74");
    	//chromeOptions.setPlatform(Platform.);
    	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), chromeOptions);
    	
    	
    	Basepage.driver.set(driver);
    	
    	Basepage.driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Basepage.driver.get().get("https://freecrm.co.in/");
    }
}
