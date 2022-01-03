package section_8;

public class Fibonacci {
    public static void main(String[] args) {
        // 1 2 3 5 8 13 21
        int a=0;
        int b=1;
        int sum=0;
        int i=1;
        while(i<=12){
            sum=a+b;
            System.out.print(sum + " ");
            a=b;
            b=sum;
            i++;
        }

    }
}
