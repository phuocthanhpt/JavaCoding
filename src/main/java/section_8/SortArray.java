package section_8;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 9, 5, 7};
        printArray(a);
        int[] a1 = sortAscending(a);
        System.out.println("Sort Ascending");
        printArray(a1);
        int[] a2 = sortDescending(a);
        System.out.println("Sort Descending");
        printArray(a2);
        printArray(a);
    }

    private static int[] sortDescending(int[] a) {
        int[] result = Arrays.copyOf(a, a.length);
        int temp;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] < result[j]) {
                    // swapping
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    private static int[] sortAscending(int[] a) {
        int[] result = Arrays.copyOf(a, a.length);
        int temp;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    // swapping
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    private static void printArray(int[] a1) {
        for (int n : a1) {
            System.out.println(n);
        }
    }
}
