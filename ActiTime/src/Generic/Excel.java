package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Auto_Const
{
	public static String getcellValue(String PATH,String Sheet,int row,int cell)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(PATH);
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(Sheet).getRow(row).getCell(cell);
			v=c.getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log("Path is invalid");
		}
		return v;
	}
}
