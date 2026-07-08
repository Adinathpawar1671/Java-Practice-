import java.util.Arrays;

public class Recursion13 {
    public static String[] toString(String parseStr[], int num, String str[], int i) {
        if (num == 0) {
            return str;
        }
        int val = num % 10;
        str[i] = parseStr[val];
        return toString(parseStr, num /= 10, str, i + 1);
    }

    public static void main(String[] args) {
        String parseStr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String str[] = new String[4];
        System.out.println(Arrays.toString(toString(parseStr, 2019, str, 0)));
    }
}
