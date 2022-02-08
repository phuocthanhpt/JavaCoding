package section_8;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 12345;
        int r, sum=0;

        while(n>0){

            r=n%10;
            n = n/10;
            sum=(sum*10)+r;
            System.out.format("r:%d - n:%d - sum:%d\n", r, n, sum);
        }


    }
}
