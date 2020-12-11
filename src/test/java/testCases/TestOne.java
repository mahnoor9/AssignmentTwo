package testCases;

import components.SideNavigationBar;
import org.jetbrains.annotations.NotNull;
import org.testng.annotations.Test;
import steps.GotoEditSteps;
import steps.OpenColumnDictionarySteps;
import steps.OpenEditViewSteps;
import sun.jvm.hotspot.debugger.cdbg.BaseClass;
import utils.SplitStringWithComma;

import java.util.*;

public class TestOne extends BaseClass {

    @Test
    public void test()
    {
        List<String> list=new ArrayList<String> ();
        list.add ("source");
        list.add("Desti");
       // OpenColumnDictionarySteps openColumnDictionarySteps = new OpenColumnDictionarySteps (driver);
       // openColumnDictionarySteps.open();
       // OpenEditViewSteps openEditViewSteps = new OpenEditViewSteps (driver);
      //  GotoEditSteps gotoEditSteps= new GotoEditSteps (driver);
       // gotoEditSteps.openEditView ();
        //openEditViewSteps.dragAndDrop (list);

        String s = "a,b,c,d,e,f,g";
        String[] result= SplitStringWithComma.splitString (s);
        for(int i = 0; i< result.length;i++)
        {
            System.out.print (result[i]);
        }

    }
}
