package ScePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase2;

public class FacilityPage extends TestBase2
{
	@FindBy(how = How.XPATH,using="//div[@id='$j1jeb3_dropdown']//preceding::img[1]")
	WebElement FavouritesMenu;
	
	@FindBy(how = How.XPATH,using="//td[@id='$cw862c_label']")
	WebElement FacilityMenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='$9fw457']//following::div[text()='INFOR_ENTERPRISE'][2]")
	WebElement EnterpriseMenu;
	
	@FindBy(xpath="//div[@id='$eakrcq']//following::div[text()='INFOR_SCP11_wmwhse1'][2]")
	WebElement Warehouse1;
	
	@FindBy(xpath="//div[@id='$eakrcq']//following::div[text()='INFOR_SCP11_wmwhse2'][2]")
	WebElement Warehouse2;
	
	@FindBy(xpath="//div[@id='$eakrcq']//following::div[text()='INFOR_SCP11_wmwhse3'][2]")
	WebElement Warehouse3;
	
	@FindBy(xpath="//div[@id='$eakrcq']//following::div[text()='INFOR_SCP11_wmwhse4'][2]")
	WebElement Warehouse4;
	
	@FindBy(xpath="//div[@id='$eakrcq']//following::div[text()='INFOR_SCP11_wmwhse5'][2]")
	WebElement Warehouse5;
	
	@FindBy(how = How.XPATH,using="//span[@id='event_$hq4iyn'][1]")
	WebElement verifyEnterprisePage;
	
	@FindBy(how = How.XPATH,using="//span[@id='event_$jniyz2'][1]")
	WebElement verifyWarehousePage;
	
	//MouseOverActions mouseOver;
	//WaitHelper waithelper;
	 
	
	public FacilityPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyEnterpriseTitle()
	{
		return driver.getTitle();
	}
	
	public EnterprisePage NavigateToEnterprise()
	{
		Wait(FavouritesMenu);
		FavouritesMenu.click();
		Wait(FacilityMenu);
		MouseOver(FacilityMenu);
		Wait(EnterpriseMenu);
		EnterpriseMenu.click();
		
		return new EnterprisePage();	
		
	}
	
	public String verifyEnterprisePage()
	{
		Wait(verifyEnterprisePage);
		return verifyEnterprisePage.getText();
	}
	
	public Warehouse1Page2 NavigateToWarehouse1()
	{
		Wait(FavouritesMenu);
		FavouritesMenu.click();
		Wait(FacilityMenu);
		MouseOver(FacilityMenu);
		Wait(Warehouse1);
		Warehouse1.click();
		
		return new Warehouse1Page2();
		
	}
	
	public String verifyWarehouse1Page()
	{
		Wait(verifyWarehousePage);
		return verifyWarehousePage.getText();
	}
	
	public Warehouse2Page2 NavigateToWarehouse2()
	{
		Wait(FavouritesMenu);
		FavouritesMenu.click();
		Wait(FacilityMenu);
		MouseOver(FacilityMenu);
		Wait(Warehouse2);
		Warehouse2.click();
		
		return new Warehouse2Page2();
		
	}
	
	public String verifyWarehouse2Page()
	{
		Wait(verifyWarehousePage);
		return verifyWarehousePage.getText();
	}
	
	
	public Warehouse5Page2 NavigateToWarehouse5()
	{
		Wait(FavouritesMenu);
		FavouritesMenu.click();
		Wait(FacilityMenu);
		MouseOver(FacilityMenu);
		Wait(Warehouse5);
		Warehouse5.click();
		
		return new Warehouse5Page2();
		
	}
	
	public String verifyWarehouse5Page()
	{
		Wait(verifyWarehousePage);
		return verifyWarehousePage.getText();
	}
	
}


