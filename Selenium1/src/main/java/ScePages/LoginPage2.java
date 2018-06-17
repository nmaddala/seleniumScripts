package ScePages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase2;

public class LoginPage2 extends TestBase2
{
	private Logger log = Logger.getLogger(LoginPage2.class);
	//WaitHelper waitHelper;
	
	@FindBy(xpath="//input[@id='Iujgbo2']")
	WebElement UserName;
	
	@FindBy(xpath="//input[@id='I604i25']")
	WebElement Password;
	
	@FindBy(xpath="//*[@id='I604i25']//following::input[1]")
	WebElement SubmitBtn;
	
	@FindBy(how=How.XPATH,using="//img[@src='images/logo.gif']")
	WebElement InforLogo;
	
	@FindBy(xpath="//*[@id='tabNumTop_0' and @class='popupLightTab']")
	WebElement SuccessMsg;
	
	
	public LoginPage2()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateInforLogo()
	{
		return InforLogo.isDisplayed();
	}
	
	public FacilityPage LoginIntoSCE(String userName, String password)
	{
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		SubmitBtn.click();
		
		return new FacilityPage();
	}

}
