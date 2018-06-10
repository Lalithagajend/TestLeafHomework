package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	
	public MyLeadsPage clickLead() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLeads);
		return new MyLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//h2[text()[contains(.,'Welcome')]]")
	private WebElement eleLoggedName;
	
	public MyHomePage verifyLoggedName(String data) {
	verifyPartialText(eleLoggedName, data);
		return this;		
	}	

}
