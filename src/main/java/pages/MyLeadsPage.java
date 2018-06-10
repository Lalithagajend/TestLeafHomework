package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeads;
	@FindBy(how=How.LINK_TEXT, using = "Merge Leads")
	private WebElement eleMergeLeads;
	@FindBy(how=How.LINK_TEXT,using ="Find Leads")
	private WebElement eleFindLeads;
	
	
	
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLeads);
		return new CreateLeadPage();		
	}
	
	public MergeLeadsPage clickMergeLead() {
		click(eleMergeLeads);
		return new MergeLeadsPage();		
	}
	
	public FindLeadsPage clickFindLead() {
		click(eleFindLeads);
		return new FindLeadsPage();		
	}
	
	
	
	
	

}
