package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import model.AdminRegister;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelGenerator 
{
	String filename="C:\\Users\\YASHASREE\\eclipse-workspace\\E-MANDI\\AdminExcel.xlsx";
	int i=1;
	FileOutputStream out;
	public Workbook excelGenerate(AdminRegister register, List<AdminRegister> list) throws IOException 
	{
		try 
		{
			Workbook hwb = new XSSFWorkbook();
			Sheet sheet=hwb.createSheet("AdminDetails");
			Row row=sheet.createRow(0);
			
			row.createCell(0).setCellValue("UserName");
			row.createCell(1).setCellValue("Email-Id");
			row.createCell(2).setCellValue("Password");
			row.createCell(3).setCellValue("confirm Password");
			row.createCell(4).setCellValue("Mobile");
			
		 	
			for(AdminDetails fillSheet: list) 
			{ 
		      	Row nextRows = sheet.createRow(i);
		      	nextRows.createCell(0).setCellValue(fillSheet.getName());
		      	nextRows.createCell(1).setCellValue(fillSheet.getId());
		      	nextRows.createCell(2).setCellValue(fillSheet.getRate());
		      	nextRows.createCell(3).setCellValue(fillSheet.getComment());
		      	nextRows.createCell(4).setCellValue(fillSheet.getRecommend());  
      	  	}

			out = new FileOutputStream(filename);
			hwb.write(out);
			return hwb;
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}
		return null;
	}
}
