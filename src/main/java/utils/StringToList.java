package utils;

import java.util.ArrayList;
import java.util.List;

public class StringToList {
    public static List<String> stringToList(String s)
    {
        List<String> list= new ArrayList<> ();
        String[] split= SplitStringWithComma.splitString (s);
        for(int i= 0;i<= split.length-1;i++)
        {
            list.add (split[i]);
            System.out.println (list.get(i));

        }
        return list;
    }
}
