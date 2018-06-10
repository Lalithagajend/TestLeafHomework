package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstNameView;
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleComNameView;
	

	public ViewLeadPage verifyFirstName(String data) {
		verifyExactText(eleFirstNameView, data);
		return this;		
	}
	public ViewLeadPage verifyComName(String data) {
		verifyExactText(eleComNameView, data);
		return this;		
	}
	//title: View Lead | opentaps CRM
	// public boolean verifyTitle(String title) 
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditbutton;
	public EditLeadPage clickEdit() {
		click(eleEditbutton);
		return new EditLeadPage();		
	}
	





}
