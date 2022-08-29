package pomframework_with_ddf_NG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class pawan_excel {
public static void main(String[] args) throws Exception {
	//creat object
	FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\S");
	//open the excel sheet using cretead method 
	 boolean data = WorkbookFactory.create(file).getSheet("pawan1").getRow(1).getCell(1).getBooleanCellValue();
	//print data in excel sheet
	System.out.println(data);
}
}
