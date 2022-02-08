package section_8;

public class FindCoupleLessThanANumber {
    public static void main(String[] args) {
        int[] a = {16, 1, 4, 2, 14};
        int[] b = {7, 11, 2, 0, 15};
        int k = 743;

        int n = solution(a, b, k);
        System.out.println("result" + n);
    }

    public static int solution(int[] a, int[] b, int k){
        int count = 0, temp;
        int b_size = b.length;
        String concateNumber = "";
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "-" +b[b_size-1-i]);
            concateNumber = String.valueOf(a[i]) + String.valueOf(b[b_size-1-i]);
            temp = Integer.parseInt(concateNumber);
            System.out.println("temp:" + concateNumber);
            if(temp<k) count++;
        }

        return count;
    }
}
