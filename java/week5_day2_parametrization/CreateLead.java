package week5_day2_parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@Test(dataProvider="fetchdata")
	public void runCreateLead(String company,String Fname,String Lname)  {
		// TODO Auto-generated method stub
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		driver.findElementByName("submitButton").click();
		

	
}
	@DataProvider(name="fetchdata")
	public String[][] sendData()
	{
		String [][] data= new String [2][3];
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="N";
		
		data[1][0]="TL";
		data[1][1]="Dhivya";
		data[1][2]="R";
		return data;
		
		
	}
	
	
}