package section_8;

public class AdjacentArray {
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 15, 17};
        System.out.println(findMaxDiff(a));
    }

    public static int findMaxDiff(int[] a) {
        int diff = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int temp = a[i + 1] - a[i];
            if (temp > diff) {
                diff = temp;
            }
        }

        return diff;
    }
}
