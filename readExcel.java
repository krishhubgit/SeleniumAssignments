package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static String readExceldata() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet wSheet = wb.getSheetAt(0);
		XSSFRow row = wSheet.getRow(2);
		XSSFCell cell = row.getCell(3);
		String data = cell.getStringCellValue();
		System.out.println("Single data: "+data);
		
		int rowCount =wSheet.getLastRowNum();
		System.out.println("rowCount: "+rowCount);
		short columnCount = wSheet.getRow(0).getLastCellNum();
		System.out.println("columnCount: "+columnCount);
		
		
		String [][] data1 = new String [rowCount][columnCount];
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow eachRow = wSheet.getRow(i);
			for (int j = 0; j <columnCount; j++) {
				String allData = eachRow.getCell(j).getStringCellValue();
				System.out.println(allData);
				data1[i-1][j]=allData;
				
				
				
			}
			wb.close();
			return data;
			
		}
		return data;
		

	}

}
