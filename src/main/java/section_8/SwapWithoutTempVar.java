package section_8;

public class SwapWithoutTempVar {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        printAB(a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        printAB(a, b);
    }

    public static void printAB(int a, int b){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
