package utils;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.*;

public class DataFromExcelSheet {

   /* public static void main(String[] args) throws Exception {


       readFromSheet ("src/test/java/testData/Book1.xlsx", "Sheet1");
    } */

    public static List<Map<String,String>> readFromSheet(String path, String sheetName) throws Exception {
        try{

            FileInputStream File= new FileInputStream (path);
            XSSFWorkbook wb = new XSSFWorkbook (File);
            XSSFSheet sheet= wb.getSheet (sheetName);

            List<Map<String,String>> sheetValues = new ArrayList<Map<String,String>>();

            XSSFRow firstRow = sheet.getRow(0);

            int rowCount = sheet.getLastRowNum ()+1;
            int colCount= firstRow.getLastCellNum ();

            for(int i=1; i<rowCount ; i++)
            {

                Map<String, String> hMap = new HashMap<String, String> ();

                for (int col = 0; col < colCount; col++)
                {

                        hMap.put (firstRow.getCell (col).toString (),sheet.getRow(i).getCell(col).toString());
                      //  System.out.print ("key: "+ firstRow.getCell (col).toString () + "  value: " + sheet.getRow(i).getCell(col).toString() );
                    }
                sheetValues.add(hMap);
                }


            return sheetValues;


        }
        catch (Exception e)
        {
            throw(e);
        }
    }

}
