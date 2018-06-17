package ScePagesTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase2;
import ScePages.EnterprisePage;
import ScePages.FacilityPage;
import ScePages.LoginPage2;

public class EnterprisePageTest extends TestBase2
{
	LoginPage2 loginPage;
	FacilityPage facilityPage;
	EnterprisePage enterprisePage;
	public EnterprisePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage2();
		facilityPage = loginPage.LoginIntoSCE(prop.getProperty("UserName"),prop.getProperty("Password"));
		enterprisePage = facilityPage.NavigateToEnterprise();
	}
	
	@Test(priority=1)
	public void NavigateToItemTest()
	{
		enterprisePage.NavigateToItem();
	}
	
	@Test(priority=2)
	public void NavigateToPackTest()
	{
		enterprisePage.NavigateToPack();
	}
	
	@Test(priority=3)
	public void NavigateToBillOfMaterialsTest()
	{
		enterprisePage.NavigateToBillOfMaterials();
	}
	
	@Test(priority=4)
	public void NavigateToOwnerTest()
	{
		enterprisePage.NavigateToOwner();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
