package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogOut);
		return new LoginPage();		
	}
	
	@FindBy(how=How.LINK_TEXT, using="CRM/SFA")
	private WebElement eleCrmsfa;
	
	public MyHomePage clickCrm() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleCrmsfa);
		return new MyHomePage();
		
	}	

	@FindBy(how=How.XPATH, using="//div[@id='form']/h2")
	private WebElement eleVerifyName;
	public HomePage verifyName(String data) {
		verifyPartialText(eleVerifyName, data);
			return this;
	}

}
