package section_8;

public class CountCharOccurence {
    public static void main(String[] args) {
        String str = "lksdfjlskdf";
        char c = 'a';

        int count = checkCharOccurence(str, c);
        System.out.println(count);
    }

    private static int checkCharOccurence(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }

        return count;
    }
}
