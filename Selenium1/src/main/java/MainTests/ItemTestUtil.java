package MainTests;

import java.util.ArrayList;



public class ItemTestUtil 
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

		for(int rowNum =2; rowNum<=reader.getRowCount("ItemEnt"); rowNum++)
		{
			String Priority = reader.getCellData("ItemEnt", "Priority", rowNum);
			String ReportID = reader.getCellData("ItemEnt", "ReportID", rowNum);
			String DataReq = reader.getCellData("ItemEnt", "DataReq", rowNum);
			String Owner = reader.getCellData("ItemEnt", "Owner", rowNum);
			String Item = reader.getCellData("ItemEnt", "Item", rowNum);
			String Description = reader.getCellData("ItemEnt", "Description", rowNum);
			String PackKey = reader.getCellData("ItemEnt", "PackKey", rowNum);
			/*String LottableValidation = reader.getCellData("ItemEnt", "LottableValidation", rowNum);
			String GrossWeight = reader.getCellData("ItemEnt", "GrossWeight", rowNum);
			String NetWeight = reader.getCellData("ItemEnt", "NetWeight", rowNum);
			String TareWeight = reader.getCellData("ItemEnt", "TareWeight", rowNum);
			String Cube = reader.getCellData("ItemEnt", "Cube", rowNum);
			String ToExpireByDays = reader.getCellData("ItemEnt", "ToExpireByDays", rowNum);
			String ShelfLifeIndicator = reader.getCellData("ItemEnt", "ShelfLifeIndicator", rowNum);
			String ShelfLifeCodeType = reader.getCellData("ItemEnt", "ShelfLifeCodeType", rowNum);
			String InboundShelfLife = reader.getCellData("ItemEnt", "InboundShelfLife", rowNum);
			String OutboundShelfLife = reader.getCellData("ItemEnt", "OutboundShelfLife", rowNum);
			String Style = reader.getCellData("ItemEnt", "Style", rowNum);
			String Color = reader.getCellData("ItemEnt", "Color", rowNum);
			String Size = reader.getCellData("ItemEnt", "Size", rowNum);
			String InboundCatchWeight = reader.getCellData("ItemEnt", "InboundCatchWeight", rowNum);
			String IBNoEntryofTotalWeight = reader.getCellData("ItemEnt", "IBNoEntryofTotalWeight", rowNum);
			String IBAverageWeight = reader.getCellData("ItemEnt", "IBAverageWeight", rowNum);
			String IBTareWeight = reader.getCellData("ItemEnt", "IBTareWeight", rowNum);
			String IBTolerance = reader.getCellData("ItemEnt", "IBTolerance", rowNum);
			String EndToEndSerialCapture = reader.getCellData("ItemEnt", "EndToEndSerialCapture", rowNum);
			String InboundCatchData = reader.getCellData("ItemEnt", "InboundCatchData", rowNum);
			String InboundSerialUnique = reader.getCellData("ItemEnt", "InboundSerialUnique", rowNum);
			String IBSerial = reader.getCellData("ItemEnt", "IBSerial", rowNum);
			String IBOther2 = reader.getCellData("ItemEnt", "IBOther2", rowNum);
			String OutboundCatchWeight = reader.getCellData("ItemEnt", "OutboundCatchWeight", rowNum);
			String OBNoEntryofTotalWeight = reader.getCellData("ItemEnt", "OBNoEntryofTotalWeight", rowNum);
			String OBAverageWeight = reader.getCellData("ItemEnt", "OBAverageWeight", rowNum);
			String OBTareWeight = reader.getCellData("ItemEnt", "OBTareWeight", rowNum);
			String OBTolerance = reader.getCellData("ItemEnt", "OBTolerance", rowNum);
			String UOMforWeightDataSerialCapture = reader.getCellData("ItemEnt", "UOMforWeightDataSerialCapture", rowNum);
			String OutboundCatchData = reader.getCellData("ItemEnt", "OutboundCatchData", rowNum);
			String OutboundSerialUnique = reader.getCellData("ItemEnt", "OutboundSerialUnique", rowNum);
			String OBSerial = reader.getCellData("ItemEnt", "OBSerial", rowNum);
			String CatchWhen = reader.getCellData("ItemEnt", "CatchWhen", rowNum);
			String InboundSummaryRFWeightCapture = reader.getCellData("ItemEnt", "InboundSummaryRFWeightCapture", rowNum);
			String OutboundSummaryRFWeightCapture = reader.getCellData("ItemEnt", "OutboundSummaryRFWeightCapture", rowNum);
			String DisplaySummaryRFWeightCaptureforOtherTransactions = reader.getCellData("ItemEnt", "DisplaySummaryRFWeightCaptureforOtherTransactions", rowNum);
			String CATCHGROSSWGT = reader.getCellData("ItemEnt", "CATCHGROSSWGT", rowNum);
			String ZeroDefaultWeightforRFPicking = reader.getCellData("ItemEnt", "ZeroDefaultWeightforRFPicking", rowNum);
			String STDGROSSWGT1 = reader.getCellData("ItemEnt", "STDGROSSWGT1", rowNum);
			String STDUOM = reader.getCellData("ItemEnt", "STDUOM", rowNum);
			String CATCHNETWGT = reader.getCellData("ItemEnt", "CATCHNETWGT", rowNum);
			String STDNETWGT1 = reader.getCellData("ItemEnt", "STDNETWGT1", rowNum);
			String CATCHTAREWGT = reader.getCellData("ItemEnt", "CATCHTAREWGT", rowNum);
			String STDTAREWGT = reader.getCellData("ItemEnt", "STDTAREWGT", rowNum);*/
			
			//Object ob[] = {Priority, ReportID, DataReq, Owner, Item, Description, PackKey, LottableValidation, GrossWeight, NetWeight, TareWeight, Cube, ToExpireByDays, ShelfLifeIndicator, InboundShelfLife, OutboundShelfLife, Style, Color, Size, InboundCatchWeight, IBNoEntryofTotalWeight, IBAverageWeight, IBTareWeight, IBTolerance, EndToEndSerialCapture, InboundCatchData, InboundSerialUnique, IBSerial, IBOther2, OutboundCatchWeight, OBNoEntryofTotalWeight, OBAverageWeight, OBTareWeight, OBTolerance, UOMforWeightDataSerialCapture, OutboundCatchData, OutboundSerialUnique, OBSerial, CatchWhen, InboundSummaryRFWeightCapture, OutboundSummaryRFWeightCapture, DisplaySummaryRFWeightCaptureforOtherTransactions, CATCHGROSSWGT, ZeroDefaultWeightforRFPicking, STDGROSSWGT1, STDUOM, CATCHNETWGT, STDNETWGT1, CATCHTAREWGT, STDTAREWGT};       
			Object ob[] = {Priority, ReportID, DataReq, Owner, Item, Description, PackKey};
			myData.add(ob);
		
		}
		
		return myData;
		}

}
