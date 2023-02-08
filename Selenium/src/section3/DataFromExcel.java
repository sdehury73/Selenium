package section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\Selenium\\data.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		int lastrow=sh.getLastRowNum();
		Short lastcell=sh.getRow(0).getLastCellNum();
		for(int i=0;i<=lastrow;i++)
		{
			for(short a=0;a<=lastcell;a++)
			{
				DataFormatter format=new DataFormatter();
				System.out.print(format.formatCellValue(sh.getRow(i).getCell(a))+" ");
			}
			System.out.println();
		}
	}
}
