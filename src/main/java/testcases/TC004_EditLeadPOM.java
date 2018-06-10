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

public class TC004_EditLeadPOM extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead using POM concepts";
		testDescription="Edit lead by altering Company name";
		testNodes="Leads";
		category="Smoke";
		authors="Lalitha";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String vName, String cName,String fName,String lName,String verifyName) {
		
		
		new LoginPage()
		.enterUserName(uName).enterPassword(pwd).clickLogIn().verifyName(vName).clickCrm()
		.clickLead().clickCreateLead().enterCompany(cName).enterFirstName(fName).enterLastName(lName)
		.clickSubmitCreateLead().verifyFirstName(verifyName); 			
		new LoginPage()
		.enterUserName(uName).enterPassword(pwd).clickLogIn().verifyName(vName).clickCrm()
		.
		
	}
	

}
