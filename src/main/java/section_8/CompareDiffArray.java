package section_8;

import java.util.ArrayList;
import java.util.List;

public class CompareDiffArray {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] b = {6, 4, 3, 7};

//        Object[] objects = findMatchedElements(a, b);
//
//        for (Object ob : objects) {
//            System.out.println(ob);
//        }

        String result = "";

        for (int i = 0; i < a.length; i++) {
            if(a[i]==b[i]){
                result = result + " " + Integer.toString(a[i]);
            }
        }

        int[] c = makeArray(result);
        for(int n : c){
            System.out.println(n);
        }
    }

    public static int[] makeArray(String str){
        String[] numbers = str.trim().split(" ");
        int[] a = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }

        return a;
    }




}
