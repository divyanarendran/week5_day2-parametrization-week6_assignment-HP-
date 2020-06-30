package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Baseclass {

	

	
	@And("enter the username as (.*)")
	public void username(String uname)
	{
		driver.findElementById("username").sendKeys(uname);
	}
	@And("enter the password as (.*)")
	public void password(String pass)
	{
		driver.findElementById("password").sendKeys(pass);
	}
	
	@When("click login button")
	public void login()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Homepage should be displayed")
	public void Homepage()
	{
		System.out.println("Homepage displayed");
	}
	@But("Error message")
	public void eroormsg()
	{
		System.out.println("Error");
	}
	
	
}
