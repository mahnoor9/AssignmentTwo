package utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFromExcelSheet {

    public static List<Map<String,List>> readFromSheet(String path, String sheetName) throws Exception {
        try{
            FileInputStream File= new FileInputStream (path);
            XSSFWorkbook wb = new XSSFWorkbook (File);
            XSSFSheet sheet= wb.getSheet (sheetName);

            List<Map<String,List>> sheetValues = new ArrayList<Map<String,List>>();

            XSSFRow firstRow = sheet.getRow(0);

            int rowCount = sheet.getLastRowNum ()+1;
            int colCount= firstRow.getFirstCellNum ();

            for(int i=1; i<rowCount ; i++) {

                Map<String, List> hMap = new HashMap<String, List> ();
                for (int col = 0; col < colCount; col++) {
                    if (firstRow.getCell (col).toString () == "Select") {
                        String s = firstRow.getCell (col).toString ();
                        String[] split = SplitStringWithComma.splitString (s);
                        hMap.put (firstRow.getCell (col).toString (), new ArrayList<String> ());
                    } else {
                        hMap.put (firstRow.getCell (col).toString (), new ArrayList<String> ());
                    }

                }
            }

        }
        catch (Exception e)
        {
            throw(e);
        }
    }

}
