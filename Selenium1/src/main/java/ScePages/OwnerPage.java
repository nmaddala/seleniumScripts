package ScePages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase2;

public class OwnerPage extends TestBase2
{
	@FindBy(how = How.XPATH,using="//div[@id='Aq5eqtt']//following::td[@id='Aq5eqtt_label'][1]")
	WebElement Owner_NewBtn;
	
	@FindBy(xpath="//td[@id='Ag3qyvc_label'][1]")
	WebElement Owner_DeleteBtn;
	
	@FindBy(xpath="//img[@id='${id}_refresh'][1]")
	WebElement Owner_RefreshBtn;
	
	@FindBy(xpath="//input[@id='$qdw8sr_filterbutton']")
	WebElement Owner_SearchBtn;
	
	@FindBy(xpath="//input[@id='I59t0m4'][1]")
	WebElement Owner_SearchField;
	
	@FindBy(how = How.XPATH,using="//input[@id='$qdw8sr_cell_0_0_Img'][1]")
	WebElement ExpandBtn;
	
	@FindBy(xpath="//span[@id='$qdw8sr_cell_0_1_span'][1]")
	WebElement verifyOwner;
	@FindBy(how = How.XPATH,using="//div[@id='C96C7B4C1EB04130AEA31EE384FAE164_9696847CFDA94B448E77F381ED9F7E32:0~0~0_0_error'][1]")
	WebElement DuplicateOwner;
	
	@FindBy(xpath="//input[@id='Imz1338'][1]")
	WebElement Owner_Enter;
	
	@FindBy(xpath="//lazywidget[@id='focus_widget']//following::input[@id='I9b5bt7'][1]")
	WebElement Owner_EnterCompany;
	
	@FindBy(xpath="//nonlazywidget[@id='focusOnMeFirst_widget']//following::input[@id='Iomphm'][1]")
	WebElement Owner_EnterDesc;
	
	@FindBy(xpath="//div[@id='Atr2hff']//following::td[@id='Atr2hff_label'][1]")
	WebElement Owner_SaveBtn;
	
	public OwnerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnOwnerNewBtn()
	{
		Wait(Owner_NewBtn);
		Owner_NewBtn.click();
		
	}
	
	public void ClickOnOwnerDeleteBtn()
	{
		Wait(Owner_DeleteBtn);
		Owner_DeleteBtn.click();
	}
	
	public void ClickOnOwnerRefreshBtn()
	{
		Wait(Owner_RefreshBtn);
		Owner_RefreshBtn.click();
	}
	
	public void ClickOnOwnerSearchBtn_verify(String owner, String ownerComp, String ownerDesc)
	{
		Wait(Owner_SearchField);
		Owner_SearchField.sendKeys(owner);
		Wait(Owner_SearchBtn);
		Owner_SearchBtn.click();
		Wait(verifyOwner);
		String duplicateOwner = verifyOwner.getText();
		if(duplicateOwner.equalsIgnoreCase(owner))
			System.out.println("Duplicate Owner");
		else
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			createOwner(owner,ownerComp,ownerDesc);
		}
			
		/*Wait(ExpandBtn);
		if(ExpandBtn.isDisplayed())
		{
			Wait(verifyOwner);
			return verifyOwner.getText();
		}*/
		
		
		
	}
	
	public void createOwner(String owner, String ownerComp, String ownerDesc)
	{
		ClickOnOwnerNewBtn();
		Wait(Owner_Enter);
		Owner_Enter.sendKeys(owner);
		Wait(Owner_EnterCompany);
		Owner_EnterCompany.sendKeys(ownerComp);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wait(Owner_EnterDesc);
		Owner_EnterDesc.sendKeys(ownerDesc);
		Wait(Owner_SaveBtn);
		Owner_SaveBtn.click();		
		
	}
	
	public String verify_DuplicateOwner(String Owner)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		String duplicateOwner = DuplicateOwner.getText();
		return duplicateOwner;
	}
	
	public void SwitchToWindow()
	{
		String ParentWindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while(i1.hasNext())
		{
			 String ChildWindow = i1.next();
			 if(!ParentWindow.equalsIgnoreCase(ChildWindow))
				 driver.switchTo().window(ChildWindow);
		}
	}

}
