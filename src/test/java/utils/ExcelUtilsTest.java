package utils;

import java.io.IOException;

public class ExcelUtilsTest {

    public static void main(String[] args) throws IOException {

        String excelFileName = "data/TestData.xlsx";
        String sheetName = "Sheet1";

        ExcelUtils excel = new ExcelUtils(excelFileName,sheetName);
        excel.getRowCount();
        excel.getCellData(1,0);
        excel.getCellData(1,1);
        excel.getCellData(1,2);
    }

}
