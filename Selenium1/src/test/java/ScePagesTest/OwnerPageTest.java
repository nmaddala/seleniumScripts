package ScePagesTest;


import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.TestBase2;
import MainTests.ItemTestUtil;
import MainTests.TestUtil2;
import MainTests.ZoneTestUtil;
import ScePages.EnterprisePage;
import ScePages.FacilityPage;
import ScePages.LoginPage2;
import ScePages.OwnerPage;

public class OwnerPageTest extends TestBase2
{
	LoginPage2 loginPage;
	FacilityPage facilityPage;
	EnterprisePage enterprisePage;
	OwnerPage ownerPage;	
	
	public OwnerPageTest()
	{
		super(); //Note: - Constructor is executing successfully
		/*initialization();
		loginPage = new LoginPage2();
		facilityPage = loginPage.LoginIntoSCE(prop.getProperty("UserName"), prop.getProperty("Password"));
		enterprisePage = facilityPage.NavigateToEnterprise();
		ownerPage =enterprisePage.NavigateToOwner();*/
	}
	
	@BeforeMethod // After constructor i think, before method is not executing (I mean it is directly loading excel file and getting error as "NoClassDefFoundError: org/apache/poi/UnsupportedFileFormatException")
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage2();
		facilityPage = loginPage.LoginIntoSCE(prop.getProperty("UserName"), prop.getProperty("Password"));
		enterprisePage = facilityPage.NavigateToEnterprise();
		ownerPage =enterprisePage.NavigateToOwner();
	}
	
	
	/*public void CreateOwnerTest(String Priority, String ReportID, String DataReq, String Owner, String Company, String Description, String MeasureSystem,
			String WeightUOM, String DimensionUOM, String CubeUOM, String CurrencyCode, String RecurringStorageCode, String TermsDescription,
			String Corporation, String Department, String TermsDescription1, String PalletExchangeTracking, String AddressLine1, String State,
			String City, String Zip, String Country)*/
	@Test(dataProvider="OwnerData", priority=1)
	public void CreateOwnerTest(String Priority, String ReportID, String DataReq, String Owner, String Company, String Description) throws Exception
	{
		System.out.println(Owner);
		if(Owner.equalsIgnoreCase("CWCDOWN012"))
		{
		Thread.sleep(3000);
		ownerPage.createOwner(Owner, Company, Description);
		String duplicateOwner = ownerPage.verify_DuplicateOwner(Owner);
		System.out.println(duplicateOwner);
		System.out.println("Tab General - Duplicate Owner, Unable to Save - Owner: " + Owner);
		if(duplicateOwner.equalsIgnoreCase("Tab General - Duplicate Owner, Unable to Save - Owner: " + Owner))
		{
			System.out.println("Duplicate Owner");
			
		}
		else
		{
			Thread.sleep(10000);
			ownerPage.SwitchToWindow();
			Thread.sleep(3000);
			WebElement Owner_ApplyChanges = driver.findElement(By.xpath("//div[@id='A1guc7i']//following::td[@id='A1guc7i_label']"));
			WaitToclickable(Owner_ApplyChanges);
			Owner_ApplyChanges.click();
		
		}
		}
				
		/*if(Owner.equals("CWCDOWN01"))
			ownerPage.ClickOnOwnerSearchBtn_verify(Owner, Company, Description);*/
		
		/*if(verifyOwner.equalsIgnoreCase(Owner))
		{
			System.out.println("Duplicate Owner");
		}
		
		else
		{
			ownerPage.createOwner(Owner, Company, Description);
		}*/
	}
	
	@DataProvider(name="OwnerData")
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = TestUtil2.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider ="getItemData",priority=2)
	public void CreateItemTest(String Priority, String ReportID, String DataReq, String Owner, String Item, String Description, String PackKey)
	{
		System.out.println(Item);
	}
	
	@DataProvider(name="getItemData")
	public Iterator<Object[]> getItemData()
	{
		ArrayList<Object[]> testData = ItemTestUtil.getItemDataFromExcel();
		return testData.iterator();
	}
	

	@Test(dataProvider ="getZoneData",priority=3)
	public void CreateZoneTest(String Priority, String ReportID, String DataReq, String Zone, String Description, String RFPickStr)
	{
		System.out.println(Zone);
	}
	
	@DataProvider(name="getZoneData")
	public Iterator<Object[]> getZoneData()
	{
		ArrayList<Object[]> testData = ZoneTestUtil.getItemDataFromExcel();
		return testData.iterator();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
