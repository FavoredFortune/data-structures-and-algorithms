package D08_MergeLinkedLists;
import D06_Insertions.*;

import java.lang.reflect.Array;

public class MergedLinkedLists {

    public static ListNode mergeLists(LinkedList listA, LinkedList listB) {
    int aSize = listA.size();
    int bSize = listB.size();
    String response = "";

    if(aSize == 0 && bSize == 0){
        System.out.println("Lists are empty");
    }
    if(aSize == 0 || bSize == 0){
        while(aSize>0 || bSize>0){
            if(aSize>0){
                String[] listForRoot = (String[]) listA;
                return listForRoot[0];
            }
        }
    }
    }


}
