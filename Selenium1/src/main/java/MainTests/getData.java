package MainTests;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class getData 
{
	@Test(dataProvider="getTestData")
	public void CreateOwnerTest(String Priority, String ReportID, String DataReq, String Owner, String Company, String Description)
	{
		System.out.println(Priority);
		System.out.println(ReportID);
		System.out.println(Owner);
		
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData()
	{
		ArrayList<Object[]> testData = TestUtil2.getDataFromExcel();
		return testData.iterator();
	}

}
