package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompany;
	@FindBy(how=How.ID, using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	private WebElement eleLastName;
	@FindBy(how=How.ID, using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	@FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	@FindBy(how=How.ID, using = "createLeadForm_generalCountryGeoId")
	private WebElement eleDDCountry;
	@FindBy(how=How.ID, using = "createLeadForm_birthDate-button")
	private WebElement eleCalBirthButton;
	@FindBy(how=How.CLASS_NAME, using ="smallSubmit")
	private WebElement eleSubmit;
	
	
	
	public MergeLeadsPage enterCompany(String data) {
		type(eleCompany, data);
		return this;
	}
	public MergeLeadsPage enterFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	public MergeLeadsPage enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	public MergeLeadsPage enterEmail(String data) {
		type(eleEmail,data);
		return this;
	}
	public MergeLeadsPage enterPhone(String data) {
		type(elePhone,data);
		return this;
	}
	public MergeLeadsPage clickCalendar() {
		click(eleCalBirthButton);
		return this;
	}
	public ViewLeadPage clickSubmitCreateLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleSubmit);
		System.out.println("about to click submit button");
		return new ViewLeadPage();	
		
	}
	
	
	
	
	

}
