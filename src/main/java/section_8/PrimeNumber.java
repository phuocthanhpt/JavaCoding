package section_8;

public class PrimeNumber {
    public static void main(String[] args) {
//        int n = 6;
//        boolean isPrime = checkPrimeNumber(n);
//        System.out.format("%d is prime number: '%s'", n, isPrime);

        isPrime_1(10, 100);
    }

    private static boolean checkPrimeNumber(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void isPrime_1(int s1, int s2) {
        int flag = 0, i, j;
        System.out.println("The prime numbers in between the entered limits are :");
        for (i = s1; i <= s2; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
    }

    public static boolean IsPrimeNumber(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
