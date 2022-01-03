package section_8;

public class SortArray {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7};
        int[] a1 = sortAscending(a);
        System.out.println("Sort Ascending");
        printArray(a1);
        int[] a2 = sortDescending(a);
        System.out.println("Sort Descending");
        printArray(a2);
    }

    private static int[] sortDescending(int[] a) {
        int[] result = a;
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    // swapping
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return result;
    }

    private static int[] sortAscending(int[] a) {
        int[] result = a;
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    // swapping
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
