package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import  java.io.IOException;

public class ExcelUtils {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    public ExcelUtils(String excelFilePath, String sheetName) throws IOException {

        workbook = new XSSFWorkbook(excelFilePath);
        sheet = workbook.getSheet(sheetName);
    }

    public static void getCellData(int rowNum, int colNum) {

        DataFormatter formatter = new DataFormatter();
        Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
        System.out.println(value);
    }

    public static void getRowCount()  {

        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println(rowCount);
    }
}
