package ScePagesTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase2;
import ScePages.FacilityPage;
import ScePages.LoginPage2;

public class FacilityPageTest extends TestBase2 
{
	
	LoginPage2 loginPage;
	FacilityPage facilityPage;
	
	
	public FacilityPageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage2();
		facilityPage = loginPage.LoginIntoSCE(prop.getProperty("UserName"),prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void NavigateToEnterpriseTest()
	{
		
		facilityPage.NavigateToEnterprise();
		String Warehouse1 = facilityPage.verifyEnterprisePage();
		Assert.assertEquals(Warehouse1, "Enterprise");
	}
	
	@Test(priority=2)
	public void NavigateToWarehouse1Test()
	{
		
		facilityPage.NavigateToWarehouse1();
		String Warehouse1 = facilityPage.verifyWarehouse1Page();
		Assert.assertEquals(Warehouse1, "WMS");
	}
	
	@Test(priority=3)
	public void NavigateToWarehouse2Test()
	{
		facilityPage.NavigateToWarehouse2();
		String Warehouse1 = facilityPage.verifyWarehouse1Page();
		Assert.assertEquals(Warehouse1, "WMS");
	}
	
	@Test(priority=4)
	public void NavigateToWarehouse5Test()
	{
		facilityPage.NavigateToWarehouse5();
		String Warehouse1 = facilityPage.verifyWarehouse1Page();
		Assert.assertEquals(Warehouse1, "WMS");
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}

}