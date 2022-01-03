package section_8;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 6;
        boolean isPrime = checkPrimeNumber(n);
        System.out.format("%d is prime number: '%s'", n, isPrime);
    }

    private static boolean checkPrimeNumber(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
