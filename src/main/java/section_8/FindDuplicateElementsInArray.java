package section_8;

import java.util.*;

public class FindDuplicateElementsInArray {
    public static void main(String args[]) {
        String str2 = "findduplicateelementsinarray";
        String[] ary = str2.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(ary));
        //Set does not allow duplicate elements
        Set<String> str1 = new HashSet<String>();
        for (String str21 : list) {
            if (str1.add(str21) == false) {
                System.out.println(str21 + " occurs: " + Collections.frequency(list, str21) + ": is the Duplicate Element");
            } else if (Collections.frequency(list, str21) < 2) {
                System.out.println(str21 + " occurs: " + Collections.frequency(list, str21));
            }
        }
    }
}
