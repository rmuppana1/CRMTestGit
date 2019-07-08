package com.crm.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelData {

	static HSSFWorkbook wbRes;
	static HSSFWorkbook wb;
	static HSSFWorkbook wbmod;

	static File src = new File("D:\\Automation\\CRMTest\\src\\main\\java\\com\\crm\\testdata/Test Data.xls");
	//static File srcRes = new File("./Test Results/Test Results.xls");
	//static File mod = new File("./Test Data/Modulelevel Tests.xls");

	public void ExcelDataProvider() {
		try {
			FileInputStream fis    = new FileInputStream(src);
			//FileInputStream fisRes = new FileInputStream(srcRes);
			//FileInputStream  dmod = new FileInputStream(mod);
			//wbRes = new HSSFWorkbook(fisRes);
			wb = new HSSFWorkbook(fis);
			//wbmod = new HSSFWorkbook(dmod);

		} catch (Exception e) {	System.out.println(e.getMessage());	}
	}

	// This method is to get data in TestData.xls file
	public String getdata(String sheetname, int row, int column) {
		try {
			String data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
			return data;
		} catch (Exception e) {
			double data = wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			int a = new Double(data).intValue();
			String dataAsString = new Integer(a).toString();
			return dataAsString;
		}
	}

	// This method is to get data in Modulelevel.xls file
	public String moduleGetData(String sheetname, int row, int column) {
		try {
			String data = wbmod.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
			return data;
		} catch (Exception e) {
			int data = (int) wbmod.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			String dataAsString = new Double(data).toString();
			return dataAsString;
		}
	}


	public void setdata(String sheetName, int row, int column, int eventNumber) throws IOException {
		try {
			wb.getSheet(sheetName).createRow(row).createCell(column).setCellValue(eventNumber);
			FileOutputStream fout = new FileOutputStream(src);
			wb.write(fout);
			fout.close();
		}catch(Exception e) {
			System.out.println("Unable to write data into excel: "+ e);
		}
	}

	// This method is to get data from Results.xls file
	public String getdataRes(String sheetname, int row, int column) {
		try {
			String data = wbRes.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
			return data;
		} catch (Exception e) {
			double data = wbRes.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
			String dataAsString = new Double(data).toString();
			return dataAsString;
		}
	}

	/*// This method is to set data in Results.xls file
	public void setdataRes(int sheetindex, int row, int column, String value) throws IOException {
		wbRes.getSheetAt(sheetindex).getRow(row).createCell(column).setCellValue(value);
		FileOutputStream fout = new FileOutputStream(srcRes);
		wbRes.write(fout);
		fout.close();
	}

	public void setdataRes(String sheetname, int row, int column, String value) throws IOException {
		wbRes.getSheet(sheetname).getRow(row).createCell(column).setCellValue(value);
		FileOutputStream fout = new FileOutputStream(srcRes);
		wbRes.write(fout);
		fout.close();
	}

	public void cleardataRes() throws Exception {
		int sheets = wbRes.getNumberOfSheets();
		for (int s = 0; s < sheets; s++) {
			int rows = wbRes.getSheetAt(s).getLastRowNum();
			for (int i = 1; i <= rows; i++) {
				wbRes.getSheetAt(s).getRow(i).createCell(3).setCellValue("");
			}
		}
		FileOutputStream fout = new FileOutputStream(srcRes);
		wbRes.write(fout);
		fout.close();
	}
*/
	// To get date from excel and convert to string format
	public String getdate(String sheetname, int row, int column) {
		Date date = wb.getSheet(sheetname).getRow(row).getCell(column).getDateCellValue();
		SimpleDateFormat format = new SimpleDateFormat("M/d/yyyy");
		String DateToStr = format.format(date);
		return DateToStr;
	}

	public int getSize(String sheetName) {
		HSSFSheet sh = wb.getSheet(sheetName);
		int data = sh.getLastRowNum();
		return data;
	}

	public int modGetSize(String sheetName) {
		HSSFSheet sh = wbmod.getSheet(sheetName);
		int data = sh.getLastRowNum();
		return data;
	}

}
