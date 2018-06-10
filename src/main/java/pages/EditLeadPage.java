package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{

	public EditLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.NAME,using="companyName")
	private WebElement eleEditComName;
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleButtonEditUpdate;
	


	public ViewLeadPage editUpdate(String data) { 
		click(eleButtonEditUpdate);
		return new ViewLeadPage();		
	}
	




}
