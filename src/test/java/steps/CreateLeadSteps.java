/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {
	public static RemoteWebDriver driver;
	@Given("Invoke LeafTap application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps");		
	}
	@And("Enter username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	@And("Enter password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		
	}
	
	@And("Click Login")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click crmsfa")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@And("click Leads tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();

	}
	@And("Click CreateLead tab")
	public void clickCreateLeadTab() {
		driver.findElementByLinkText("Create Lead").click();

	}
	@And("Enter company name as (.*)")
	public void enterCName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);

	}
	@And("Enter first name as (.*)")
	public void enterFname(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);

	}
	@And("Enter last name as (.*)")
	public void enterLname(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

	}
	@When("Click Create Lead button")
	public void clickCreateLeadButton() {
		driver.findElementByXPath("//input[@value='Create Lead']").click();

	}
	@Then("verify createLead is success as (.*)")
	public void verifyCreate(String name) {
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if(text.equals(name))
			System.out.println("Successfully created the lead"+name);
	}
	
	/*
	 *And Enter username
And Enter password
And click crmsfa
And click Leads tab
And Click CreateLead tab
And Enter company name
And Enter first name
And Enter last name
And Click Create Lead button
	 */

/*}*/
