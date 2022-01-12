package section_8;

public class MinMaxInMultiDemensionArray {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 7}, {5, 2, -7, 13}, {9, 10, 111}};
        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] < min){
                    min = a[i][j];
                }

                if(a[i][j] > max){
                    max = a[i][j];
                }
            }
        }

        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
    }
}
