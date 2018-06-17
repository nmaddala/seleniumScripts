package ScePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase2;

public class EnterprisePage extends TestBase2
{

	//Enterprise Menus'
	@FindBy(how=How.XPATH,using="//img[@id='$hq4iyn_arrow'][1]")
	WebElement EnterpriseA;
	
	@FindBy(how=How.XPATH,using="//div[@id='toggle_$m3v3h3']//preceding::div[@style='font-size:14px;' and text()='Multi-Facility'][1]")
	WebElement MultiFaacilityMenu;
	
	@FindBy(xpath="//div[@id='toggle_$57kepd']//preceding::div[text()='Configuration'][1]")
	WebElement ConfigurationMenu;
	
	@FindBy(xpath="//div[@id='toggle_$8eare0']//preceding::div[@style='font-size:14px;' and text()='Administration']")
	WebElement AdministrationMenu;
	
	//Reports Menus'
	@FindBy(xpath="//span[@id='i$9al8ic']//preceding::span[@id='event_$9al8ic' and text()='Reports'][1]")
	WebElement ReportsMenu1;
	
	@FindBy(xpath="//div[@id='SectionColumn1']//preceding::div[@style='font-size:14px;padding-top:7px;' and text()='Reports'][1]")
	WebElement ReportsMenu2;
	
	//Under Multi-Facility Menu
	@FindBy(xpath="//span[@id='i$gexphh']//preceding::li[text()='Inventory Balances'][1]")
	WebElement InventoryBalancesMenu;
	
	@FindBy(xpath="//span[@id='i$6pxq65']//preceding::li[text()='Inventory Charts'][1]")
	WebElement InventoryChartsMenu;
	
	@FindBy(xpath="//span[@id='i$57kepd']//preceding::li[text()='Transfer Inquiry'][1]")
	WebElement TransferInquiryMenu;
	
	//Under Configuration Menu
	@FindBy(xpath="//span[@id='i$itgzls']//preceding::li[text()='Item'][1]")
	WebElement ItemMenu;
	
	@FindBy(xpath="//span[@id='i$3xvrcf']//preceding::li[text()='Pack'][1]")
	WebElement PackMenu;
	
	@FindBy(xpath="//span[@id='i$dwa0x5']//preceding::li[text()='Bill of Material'][1]")
	WebElement BillOfMaterialMenu;
	
	@FindBy(xpath="//div[@id='toggle_$dwa0x5']//preceding::div[@style='font-size:14px;' and text()='Trading Partner'][1]")
	WebElement TradingPartnerMenu;
	
	//Configuration >> Trading Partner
	@FindBy(xpath="//span[@id='i$5yx0vy']//following::div[@id='$5yx0vy']//li[1][1]")
	WebElement OwnerMenu;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$uf7c5q']//following::div[@id='$uf7c5q']//li[1][1]")
	WebElement ShipTo;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$pvqrk5']//following::div[@id='$pvqrk5']//li[1][1]")
	WebElement Supplier;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$j9pmy5']//following::div[@id='$j9pmy5']//li[1][1]")
	WebElement Carrier;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$mmezrj']//following::div[@id='$mmezrj']//li[1][1]")
	WebElement BillTo;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$nznahe']//following::div[@id='$nznahe']//li[1][1]")
	WebElement OwnerBillTo;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$jeme9o']//following::div[@id='$jeme9o']//li[1][1]]")
	WebElement FrieghtBillTo;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$7ox4s5']//following::div[@id='$7ox4s5']//li[1][1]")
	WebElement Customer;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$9bu4so']//following::div[@id='$9bu4so']//li[1][1]")
	WebElement ShipFrom;
	
	
	//Configuration>>Codes
	@FindBy(xpath="//div[@id='toggle_$n6v7p2']//preceding::div[@style='font-size:14px;' and text()='Codes'][1]")
	WebElement CodesMenu;
	
	//Configuration>> Productivity
	@FindBy(xpath="//div[@id='toggle_$939cm1']//preceding::div[@style='font-size:14px;' and text()='Productivity'][1]")
	WebElement Productivity;
	
	//Configuration>> ValidationRules
	@FindBy(xpath="//div[@id='toggle_$vr6o86']//preceding::div[@style='font-size:14px;' and text()='Validation Rules'][1]")
	WebElement ValidationRulesMenu;
	
	//Configuration>> Barcodes
	@FindBy(xpath="//span[@id='i$8eare0']//preceding::div[@style='font-size:14px;' and text()='Barcodes'][1]")
	WebElement BarcodesMenu;
	
	//---------Under Administration Menu----------
	//Administration>> ExcelImports
	@FindBy(xpath="//div[@id='toggle_$atyl29']//preceding::div[@style='font-size:14px;' and text()='Excel Imports']")
	WebElement ExcelImportsMenu;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$roepbb']//following::div[@id='$roepbb']//li[1]")
	WebElement SubmitLogs;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$e89rcp']//following::div[@id='$e89rcp']//li[1]")
	WebElement Logs;
	
	////Administration >> FacilityManagement
	@FindBy(xpath="//div[@id='toggle_$nyk2kv']//preceding::div[@style='font-size:14px;' and text()='Facility Management']")
	WebElement FacilityManagementMenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='toggle_$nyk2kv']//following::div[@id='$3vkl2d']//li[1]")
	WebElement MultiFacility;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$6efgce']//following::div[@id='$6efgce']//li[1]")
	WebElement FacilityActivation;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$pmta2v']//following::div[@id='$pmta2v']//li[1]")
	WebElement CopyWarehouse;
	
	@FindBy(how=How.XPATH,using="//span[@id='i$hcxr3j']//following::div[@id='$hcxr3j']//li[1]")
	WebElement CopyWarehouseLog;
	
	//Administration >> FacilityControl
	@FindBy(how=How.XPATH,using="//span[@id='i$twd2ib']//following::div[@id='$twd2ib']//div[1]")
	WebElement FacilityControl;
		
	public EnterprisePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public ItemPage NavigateToItem()
	{
		Wait(EnterpriseA);
		EnterpriseA.click();
		Wait(ConfigurationMenu);
		ConfigurationMenu.click();
		Wait(ItemMenu);
		ItemMenu.click();
		
		return new ItemPage();
	}
	
	public PackPage NavigateToPack()
	{
		Wait(EnterpriseA);
		EnterpriseA.click();
		Wait(ConfigurationMenu);
		ConfigurationMenu.click();
		Wait(PackMenu);
		PackMenu.click();
		
		return new PackPage();
	}
	
	public BillOfMaterialsPage NavigateToBillOfMaterials()
	{
		Wait(EnterpriseA);
		EnterpriseA.click();
		Wait(ConfigurationMenu);
		ConfigurationMenu.click();
		Wait(BillOfMaterialMenu);
		BillOfMaterialMenu.click();
		
		return new BillOfMaterialsPage();
	}
	
		
	public OwnerPage NavigateToOwner()
	{
		Wait(EnterpriseA);
		EnterpriseA.click();
		Wait(ConfigurationMenu);
		ConfigurationMenu.click();
		Wait(TradingPartnerMenu);
		TradingPartnerMenu.click();
		Wait(OwnerMenu);
		OwnerMenu.click();
		
		return new OwnerPage();
	}
	
}
