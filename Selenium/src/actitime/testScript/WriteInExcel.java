package actitime.testScript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteInExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("D:\\\\Selenium\\\\data.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet1");
		sh.getRow(3).createCell(1).setCellValue("DS");
		sh.createRow(4).createCell(0).setCellValue("Sab");
		FileOutputStream fos=new FileOutputStream("D:\\\\Selenium\\\\data.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("Done");
	}
}
