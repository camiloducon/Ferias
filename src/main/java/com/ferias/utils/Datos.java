package com.ferias.utils;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datos {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	Logger logger  = Logger.getLogger(Datos.class.getName());
	
	public Datos(String excelPath) {
		try {
			FileInputStream fis = new FileInputStream(excelPath);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			logger.log(Level.INFO, e.getMessage());
		}
	}

	public ArrayList<String[]> readData(String pestana) {
		sheet = wb.getSheet(pestana);
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		// Create a loop over all the rows of excel file to read it
		ArrayList<String[]> datos = new ArrayList<>();
		for (int i = 1; i < rowCount + 1; i++) {
			Row rowSheet = sheet.getRow(i);
			// Create a loop to print cell values in a row
			String[] datosFila = new String[rowSheet.getLastCellNum()];
			for (int j = 0; j < rowSheet.getLastCellNum(); j++) {
				switch (rowSheet.getCell(j).getCellType()) {
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(rowSheet.getCell(j))) {
						long date = rowSheet.getCell(j).getDateCellValue().getTime();
						datosFila[j] = date + "";
					} else {
						long numero = (long) rowSheet.getCell(j).getNumericCellValue();
						datosFila[j] = numero + "";
					}
					break;
				default:
					datosFila[j] = rowSheet.getCell(j).getStringCellValue();
					break;
				}
			}
			datos.add(datosFila);
		}
		return datos;
	}

}
