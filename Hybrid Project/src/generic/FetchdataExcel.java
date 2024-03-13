package generic;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchdataExcel {

		public static String getdata(String sheet,int ro,int co) 
		{
			  String val="";	
			
			try {
				FileInputStream fil=new FileInputStream("./xmlfolder/Book1.xlsx");
		Workbook	book=WorkbookFactory.create(fil);
			
		
		
	Sheet s = book.getSheet(sheet);
	Row r = s.getRow(ro);
	Cell c = r.getCell(co);
	
		val=c.toString();
	
			}
			catch(Exception e) {
				System.out.println(" file not found");
				e.printStackTrace();
			}
			return val;
	}

}
