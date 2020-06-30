package steps;
//import cucumber.api.Scenario;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;

//import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks extends Baseclass {
@Before
public void preConditions(Scenario sc)
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://leaftaps.com/opentaps/");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println(sc.getName());
	System.out.println(sc.getId());
	
	
	}

@After
public void postCondition(Scenario sc)
{
	driver.close();
	System.out.println("close");
	System.out.println(sc.getStatus());
	}

}
