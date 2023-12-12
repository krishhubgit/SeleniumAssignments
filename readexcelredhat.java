package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcelredhat {
	
	public static String [][] readExceldata() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/RedHat.xlsx");
		XSSFSheet wSheet = book.getSheetAt(0);		
		int row =wSheet.getLastRowNum();		
		short column = wSheet.getRow(0).getLastCellNum();
	
		
		
		String [][] data1 = new String [row][column];
		for (int i = 1; i <=row; i++) {			
			for (int j = 0; j <column; j++) {
				String stringCellValue = wSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data1[i-1][j]=stringCellValue;
				
				
				
			}
			book.close();
			return data1;		

	

	}
		return data1;}

}

