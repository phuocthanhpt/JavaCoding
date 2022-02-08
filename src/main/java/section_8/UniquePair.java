package section_8;

import java.util.ArrayList;

public class UniquePair {
    public static void main(String[] args) {
        int[] a = {1, 4, 7, 1, 5, 7, 9, 0, 3, 4, 1, 5, 6, 8, 9};

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> uniquePair = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            if (!numbers.contains(a[i])) {
                numbers.add(a[i]);
                count++;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                    }
                }

                if (count == 2) {
                    uniquePair.add(a[i]);
                }
            }
        }
        System.out.println("Unique pair");
        for (Integer num : uniquePair) {
            System.out.println(num);
        }
    }


}
