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
            System.out.println ("asdf");
            FileInputStream File= new FileInputStream (path);
            XSSFWorkbook wb = new XSSFWorkbook (File);
            XSSFSheet sheet= wb.getSheet (sheetName);

            List<Map<String,String>> sheetValues = new ArrayList<Map<String,String>>();

            XSSFRow firstRow = sheet.getRow(0);

            int rowCount = sheet.getLastRowNum ()+1;
            int colCount= firstRow.getLastCellNum ();

            System.out.println (colCount);
            for(int i=1; i<rowCount ; i++)
            {

                Map<String, String> hMap = new HashMap<String, String> ();

                for (int col = 0; col < colCount; col++)
                {
                   /* if (firstRow.getCell (col).toString () == "Select") {
                        List<String> listString= new ArrayList<String> ();
                        String s = firstRow.getCell (col).toString ();
                        String[] split = SplitStringWithComma.splitString (s);
                        System.out.println (split.length+1);
                        for(int a=0; a<=split.length; a++)
                        {
                            listString.add (split[a]);
                            System.out.print ("key: "+ firstRow.getCell (col).toString () + "  value: " + listString.get (0) + "  " );
                            System.out.println ("valueeee ");
                        }
                        hMap.put (firstRow.getCell (col).toString (), listString );

                    } else {
                        System.out.println ("sfsdf"); */
                       // List<String> listString= new ArrayList<String> ();
                       // listString.add(sheet.getRow(i).getCell(col).toString());
                        hMap.put (firstRow.getCell (col).toString (),sheet.getRow(i).getCell(col).toString());
                        System.out.print ("key: "+ firstRow.getCell (col).toString () + "  value: " + sheet.getRow(i).getCell(col).toString() );
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
