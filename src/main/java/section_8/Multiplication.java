package section_8;

public class Multiplication {
    public static void main(String[] args) {
        int result = multiply(5, 0);
        System.out.println(result);
    }

    private static int multiply(int i, int j) {
        int sum = 0;
//        if(j==0) return 0;

            for (int k = 0; k < j; k++) {
                sum += i;
            }


        return sum;
    }
}
