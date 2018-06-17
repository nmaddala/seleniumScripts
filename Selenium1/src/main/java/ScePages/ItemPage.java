package ScePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.TestBase2;

public class ItemPage extends TestBase2
{
	//Item screen Buttons
	@FindBy(xpath="//td[@id='Ahhclb7_label'][1]")
	WebElement Item_NewBtn;
	
	@FindBy(xpath="//td[@id='Aq8kvq2_label'][1]")
	WebElement Item_SaveBtn;
	
	@FindBy(xpath="//td[@id='A7a1ump_label'][1]")
	WebElement Item_DeleteBtn;
	
	@FindBy(xpath="//td[@id='Ati3ktg_label'][1]")
	WebElement Item_DuplicateBtn;
	
	@FindBy(xpath="//td[@id='A8jdego_label'][1]")
	WebElement Item_DeletedRecordsBtn;
	
	@FindBy(xpath="//img[@id='${id}_refresh'][1]")
	WebElement Item_RefreshBtn;
	
	@FindBy(xpath="//input[@id='$asvr2k_filterbutton'][1]")
	WebElement Item_SearchBtn;
	
	@FindBy(xpath="//div[@id='A9qaars'][1]")
	WebElement Item_ImportBtn;
	
	//Item screen search fields
	@FindBy(xpath="//input[@id='I6wc4s3'][1]")
	WebElement Item_ItemSearchField;
	
	@FindBy(xpath="//input[@id='In41rbr'][1]")
	WebElement Item_DescSearchField;
	
	@FindBy(xpath="//input[@id='I59t0m4'][1]")
	WebElement Item_OwnerSearchField;
	
	@FindBy(xpath="//input[@id='Iaceegs'][1]")
	WebElement Item_PackSearchField;
	
	//Fields in Items General tab
	@FindBy(xpath="//input[@id='Imz1338'][1]")
	WebElement Item_EnterOwner;
	
	@FindBy(xpath="//input[@id='Ikwqt79'][1]")
	WebElement Item_EnterItem;
	
	@FindBy(xpath="//input[@id='I7et9u7'][1]")
	WebElement Item_EnterDesc;
	
	@FindBy(xpath="//input[@id='Ijr8sek'][1]")
	WebElement Item_EnterPack;
	
	@FindBy(xpath="//input[@id='Ixa7rs6'][1]")
	WebElement Item_EnterCube;
	
	@FindBy(xpath="//input[@id='I1oqky9'][1]")
	WebElement Item_EnterGrossWgt;
	
	@FindBy(xpath="//input[@id='Iqrszq0'][1]")
	WebElement Item_EnterNetWgt;
	
	@FindBy(xpath="//input[@id='I8x27wu'][1]")
	WebElement Item_EnterTareWgt;
	
	
	public ItemPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnNewBtn()
	{
		Wait(Item_NewBtn);
		Item_NewBtn.click();
	}
	
	public void clickOnSaveBtn()
	{
		Wait(Item_SaveBtn);
		Item_SaveBtn.click();
	}
	
	public void clickOnDeleteBtn()
	{
		Wait(Item_DeleteBtn);
		Item_DeleteBtn.click();
	}
	
	public void clickOnDuplicateBtn()
	{
		Wait(Item_DuplicateBtn);
		Item_DuplicateBtn.click();
	}
	
	public void clickOnSearchBtn()
	{
		Wait(Item_SearchBtn);
		Item_SearchBtn.click();
	}
	
	public void clickOnRefreshBtn()
	{
		Wait(Item_RefreshBtn);
		Item_RefreshBtn.click();
	}
	
	public void ItemSearch_Withitem(String Item)
	{
		Wait(Item_ItemSearchField);
		Item_ItemSearchField.sendKeys(Item);
	}
	
	public void ItemSearch_WithOwner(String Owner)
	{
		Wait(Item_OwnerSearchField);
		Item_OwnerSearchField.sendKeys(Owner);
	}
	
	public void EnterOwner(String Owner)
	{
		Wait(Item_EnterOwner);
		Item_EnterOwner.clear();
		sleep(3000);
		Item_EnterOwner.sendKeys(Owner);
	}
	
	public void EnterItem(String Item)
	{
		Wait(Item_EnterItem);
		Item_EnterItem.clear();
		sleep(3000);
		Item_EnterItem.sendKeys(Item);
	}
	
	public void EnterDesc(String Desc)
	{
		Wait(Item_EnterDesc);
		Item_EnterDesc.clear();
		sleep(3000);
		Item_EnterDesc.sendKeys(Desc);
	}
	
	public void EnterPack(String Pack)
	{
		Wait(Item_EnterPack);
		sleep(3000);
		Item_EnterPack.clear();
		Item_EnterPack.sendKeys(Pack);
	}
	
	public void EnterCube(String Cube)
	{
		Wait(Item_EnterCube);
		sleep(5000);
		Item_EnterCube.clear();
		Item_EnterCube.sendKeys(Cube);
	}
	
	public void EnterGW(String GW)
	{
		Wait(Item_EnterGrossWgt);
		sleep(4000);
		Item_EnterGrossWgt.clear();
		Item_EnterGrossWgt.sendKeys(GW);
	}
	
	public void EnterNW(String NW)
	{
		Wait(Item_EnterNetWgt);
		Item_EnterNetWgt.clear();
		sleep(3000);
		Item_EnterNetWgt.sendKeys(NW);
	}
	
	public void EnterTW(String TW)
	{
		Wait(Item_EnterTareWgt);
		Item_EnterTareWgt.clear();
		sleep(3000);
		Item_EnterTareWgt.sendKeys(TW);
	}
	
	public void EnterItemDetails_GeneralTab(String Item, String Owner, String Desc, String Pack, String Cube, String GW, String NW, String TW)
	{
		
		EnterOwner(Owner);
		EnterCube(Cube);
		EnterItem(Item);
		EnterGW(GW);
		EnterDesc(Desc);
		EnterNW(NW);
		EnterPack(Pack);
		EnterTW(TW);
		
	}
	
	public void CreateItem(String Item, String Owner, String Desc, String Pack, String Cube, String GW, String NW, String TW)
	{
		sleep(2000);
		clickOnNewBtn();
		EnterItemDetails_GeneralTab(Item, Owner, Desc, Pack, Cube, GW, NW, TW);
		clickOnSaveBtn();
	}
	
	
	

}
