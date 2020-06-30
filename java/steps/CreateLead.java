package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends Baseclass{
	
	@Then("click CRM\\/SFA link")
	public void clickCRMSFALink() {
		driver.findElementByXPath("//div[@for='crmsfa']//a[1]").click();
	}
	@Then("click on Leads link")
	public void clickOnLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	   
	}
	@Then("click on Create Lead link")
	public void clickOnCreateLeadLink() {
		driver.findElementByLinkText("Create Lead").click();
	    
	}
	@Then("enter company as (.*)")
	public void enterCompanyAsTestLeaf(String company) {
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
	    
	}
	@Then("enter firstname as (.*)")
	public void enterFirstnameAsDivya(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	    
	}
	@Then("enter lastname as (.*)")
	public void enterLastnameAsN(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);	   
	}
	@When("click on submit button")
	public void clickOnSubmitButton() {
		driver.findElementByName("submitButton").click();		
	}

	

}
