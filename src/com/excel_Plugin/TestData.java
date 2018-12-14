package com.excel_Plugin;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class TestData {

public static void main(String[] args) throws InvalidFormatException, IOException {
		
		String path=System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";
		
		
		ReadExcelData data=new ReadExcelData(path);
		data.loadExcelfile();
		//data.rowCount("TestData");
		//data.colCount("TestData");
		//data.getTestcaseposition("TestData","TC_02");
		//data.getcolpositin("TestData", "month");
		String testdata=data.getData("TestData","TC_02","month");
		System.out.println(testdata);
	}

	}


