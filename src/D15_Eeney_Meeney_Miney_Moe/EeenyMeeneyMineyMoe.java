package D15_Eeney_Meeney_Miney_Moe;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EeenyMeeneyMineyMoe extends LinkedList{

    public static String moe(LinkedList<String> names, int n) {
        int count = 0;
        String captured;
        if (names.size() == 0) {
            return "This list is empty.";
        }

        while (names.size() > 1) {
            captured = names.poll();
            count ++;
            //thanks to Geeks for Geeks and classmate Amy Cohen for help on this one
            //https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
            if(count % n != 0) {
               names.add(captured);
            }

        }
        return names.get(0).toString();
    }
}
