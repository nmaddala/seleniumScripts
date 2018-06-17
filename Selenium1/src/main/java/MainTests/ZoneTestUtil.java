package MainTests;

import java.util.ArrayList;

public class ZoneTestUtil
{
	static Datadriven reader;
	public static String path; 

	public static ArrayList<Object[]> getItemDataFromExcel()
	{
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			
				reader = new Datadriven("C:\\Users\\nmaddala\\eclipse-workspace\\SceTest\\src\\test\\java\\Resources\\GetData.xlsx");
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}		

		for(int rowNum =2; rowNum<=reader.getRowCount("Zone"); rowNum++)
		{
			String Priority = reader.getCellData("Zone", "Priority", rowNum);
			String ReportID = reader.getCellData("Zone", "ReportID", rowNum);
			String DataReq = reader.getCellData("Zone", "DataReq", rowNum);
			String Zone = reader.getCellData("Zone", "Zone", rowNum);
			String Description = reader.getCellData("Zone", "Description", rowNum);
			String RFPickStr = reader.getCellData("Zone", "RFPickStr", rowNum);
			Object ob[] = {Priority, ReportID, DataReq, Zone, Description, RFPickStr};
			myData.add(ob);
		
		}
		
		return myData;
		}

}
