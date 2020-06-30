package steps;

import cucumber.api.java.en.Then;

public class EditLead extends Baseclass{
	@Then("click on Find leads")
	public void clickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		
	}

	@Then("click on Phone tab")
	public void clickOnPhoneTab() {
		
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@Then("in phonenumber field enter as (.*)")
	public void inPhonenumberFieldEnterAs(String phnum) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phnum);
	}

	@Then("click on Findleads button")
	public void clickOnFindleadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
	}

	@Then("click on the first element in the table")
	public void clickOnTheFirstElementInTheTable() {
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

	}

	@Then("click on Edit button")
	public void clickOnEditButton() {
		driver.findElementByLinkText("Edit").click();
	}

	@Then("update the companyname as (.*)")
	public void updateTheCompanynameAsTcs(String company) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(company);
	  
	}

	@Then("click on update button")
	public void clickOnUpdateButton() {
		driver.findElementByName("submitButton").click();
	}


}
