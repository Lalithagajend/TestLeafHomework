package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeadinPOM extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead using POM concepts";
		testDescription="Create lead by entering Company name, first name, Last name";
		testNodes="Leads";
		category="Smoke";
		authors="Lalitha";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String vName, String cName,String fName,String lName,String verifyName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyName(vName)
		.clickCrm()
		.clickLead()
		.clickCreateLead()
		.enterCompany(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmitCreateLead()
		.verifyFirstName(verifyName); 			
		
		
	}
	

}
