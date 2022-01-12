package section_8;

import java.util.ArrayList;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] a = {4, 5, 3, 5, 5, 4, 6, 6, 9, 4};

        ArrayList<Integer> numbers = new ArrayList<>();
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
                System.out.format("%d : %d\n", a[i], count);
                if (count == 1) System.out.format("%d is unique number\n", a[i]);
            }
        }
    }
}
