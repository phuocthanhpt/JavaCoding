package section_8;

public class SumOfElements {
    public static void main(String[] args) {
        int[] a = {3, 5, 2, 7, 9};

        int sum = sumArray(a);
        System.out.println("Sum all elements of array: " + sum);
    }

    private static int sumArray(int[] a) {
        int sum = 0;
        for (int n : a) {
            sum += n;
        }

        return sum;
    }
}
