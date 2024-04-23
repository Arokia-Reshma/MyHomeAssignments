package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/Login1.xlsx");
		XSSFSheet sheet  = wb.getSheetAt(0);
	XSSFRow row = sheet.getRow(0);
	
	int rowCount = sheet.getLastRowNum();
	System.out.println("no of rows :" +rowCount);
	int cellCount = row.getLastCellNum();
	System.out.println("no of cells :" +cellCount);
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	System.out.println("with header rows:" +physicalNumberOfRows);
		String Value = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(Value);
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j < rowCount; j++) {
				String data= row2.getCell(j).getStringCellValue();
				System.out.println(data);
				
			}
		}
wb.close();
	}

}
