package utils;

import java.util.ArrayList;
import java.util.List;

public class GetSortedList {

    public static List<String> sorted(String s)
    {
        List<String> list = new ArrayList<> ();
       list= StringToList.stringToList(s);
               list.sort (String.CASE_INSENSITIVE_ORDER);
               return list;
    }
}
