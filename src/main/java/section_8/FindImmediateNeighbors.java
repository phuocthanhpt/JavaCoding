package section_8;

import java.util.*;

public class FindImmediateNeighbors {
    public static void main(String args[]) {
        int[] a = {2, 4, 6, 6, 4, 2};

        int n = findImmediateNeighbors(a);
        System.out.println(n);
    }

    private static int findImmediateNeighbors(int[] a) {
        int mid, prev, next;
        int size = a.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                prev = 0;
            } else {
                prev = a[i - 1];
            }

            if (i == size - 1) {
                next = 0;
            } else {
                next = a[i + 1];
            }
            mid = a[i];

            // Check value
            double temp = (double) (prev + next) / 2;
            System.out.format("Prev %d, Mid %d, Next %d, temp %f\n", prev, mid, next, temp);
            if (temp == mid) count++;
        }
        return count;
    }


}

