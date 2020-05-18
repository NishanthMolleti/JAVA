package service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import model.AdminRegister;
import model.Register;

import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;

public class ExcelGenerator 
{
	String filename="C:\\Users\\YASHASREE\\eclipse-workspace\\E-MANDI\\AdminExcel.xls";
	int i=1;
	FileOutputStream out;
	public HSSFWorkbook  excelGenerate(Register register, List<Register> list) throws IOException 
	{
		try 
		{
			HSSFWorkbook  hwb = new HSSFWorkbook ();
			HSSFSheet  sheet=hwb.createSheet("AdminDetails");
			Row row=sheet.createRow(0);
			
			row.createCell(0).setCellValue("UserName");
			row.createCell(1).setCellValue("Email-Id");
			row.createCell(2).setCellValue("Password");
			row.createCell(3).setCellValue("confirm Password");
			row.createCell(4).setCellValue("Mobile");
			
		 	
			for(Register fillSheet: list) 
			{ 
		      	Row nextRows = sheet.createRow(i);
		      	nextRows.createCell(0).setCellValue(fillSheet.getUserName());
		      	nextRows.createCell(1).setCellValue(fillSheet.getEmail());
		      	nextRows.createCell(2).setCellValue(fillSheet.getPassword());
		      	nextRows.createCell(3).setCellValue(fillSheet.getConfirmPassword());
		      	nextRows.createCell(4).setCellValue(fillSheet.getMobile());  
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
