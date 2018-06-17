package ScePagesTest;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.TestBase2;
import MainTests.ItemTestUtil;
import ScePages.EnterprisePage;
import ScePages.FacilityPage;
import ScePages.ItemPage;
import ScePages.LoginPage2;
import ScePages.OwnerPage;

public class ItemPageTest extends TestBase2
{
	private static final String String = null;
	public LoginPage2 loginPage;
	public FacilityPage facilityPage;
	public EnterprisePage enterprisePage;
	public OwnerPage ownerPage;
	public ItemPage itemPage;

	public ItemPageTest()
	{		
		super(); 
	}
		
		@BeforeMethod // After constructor i think, before method is not executing (I mean it is directly loading excel file and getting error as "NoClassDefFoundError: org/apache/poi/UnsupportedFileFormatException")
		public void setUp()
		{
			initialization();
			loginPage = new LoginPage2();
			facilityPage = loginPage.LoginIntoSCE(prop.getProperty("UserName"), prop.getProperty("Password"));
			enterprisePage = facilityPage.NavigateToEnterprise();
			itemPage = enterprisePage.NavigateToItem();
			
		}
		
		/*@Test
		public void CreateItemTest()
		{
			itemPage.CreateItem("RDITEM99", "RDOWNER01", "RDITEM99 Desc", "STD", "10", "9", "8", "1");
		}
		*/
		@Test(dataProvider ="getItemData")
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
		
		
	
}
