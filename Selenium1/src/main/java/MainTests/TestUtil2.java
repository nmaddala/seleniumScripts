package MainTests;

import java.io.File;
import java.util.ArrayList;

public class TestUtil2 
{
	static Datadriven reader;
	public static String path; 
	//public static String sheetName = "Owner"; 
	public static ArrayList<Object[]> getDataFromExcel()
	{
		path ="C:\\Users\\nmaddala\\eclipse-workspace\\SceTest\\src\\test\\java\\Resources\\GetData.xlsx";
		//sheetName ="Owner";
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Datadriven(path);
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
				
		for(int rowNum =2; rowNum<=reader.getRowCount("Owner"); rowNum++)
		{
			String Priority = reader.getCellData("Owner", "Priority", rowNum);
			String ReportID = reader.getCellData("Owner", "ReportID", rowNum);
			String DataReq = reader.getCellData("Owner", "DataReq", rowNum);
			String Owner = reader.getCellData("Owner", "Owner", rowNum);
			String Company = reader.getCellData("Owner", "Company", rowNum);
			String Description = reader.getCellData("Owner", "Description", rowNum);
			/*String MeasureSystem = reader.getCellData("Owner", "MeasureSystem", rowNum);
			String WeightUOM = reader.getCellData("Owner", "WeightUOM", rowNum);
			String DimensionUOM = reader.getCellData("Owner", "DimensionUOM", rowNum);
			String CubeUOM = reader.getCellData("Owner", "CubeUOM", rowNum);
			String CurrencyCode = reader.getCellData("Owner", "CurrencyCode", rowNum);
			String RecurringStorageCode = reader.getCellData("Owner", "RecurringStorageCode", rowNum);
			String TermsDescription = reader.getCellData("Owner", "TermsDescription", rowNum);
			String Corporation = reader.getCellData("Owner", "Corporation", rowNum);
			String Department = reader.getCellData("Owner", "Department", rowNum);
			String TermsDescription1 = reader.getCellData("Owner", "TermsDescription1", rowNum);
			String PalletExchangeTracking = reader.getCellData("Owner", "PalletExchangeTracking", rowNum);
			String AddressLine1 = reader.getCellData("Owner", "AddressLine1", rowNum);
			String State = reader.getCellData("Owner", "State", rowNum);
			String City = reader.getCellData("Owner", "City", rowNum);
			String Zip = reader.getCellData("Owner", "Zip", rowNum);
			String Country = reader.getCellData("Owner", "Country", rowNum);
*/			
			//Object ob[] = {Priority, ReportID, DataReq, Owner, Company, Description, MeasureSystem, WeightUOM, DimensionUOM, CubeUOM, CurrencyCode, RecurringStorageCode, TermsDescription, Corporation, Department, TermsDescription1,PalletExchangeTracking, AddressLine1, State, City, Zip, Country};  
			Object ob[] = {Priority, ReportID, DataReq, Owner, Company, Description};
			myData.add(ob);
			
		}
		
		return myData;
	}

}
