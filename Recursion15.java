public class Recursion15 {
    public static void startEndSubString(int i, int j, String str, String subStr) {
        if (i == str.length()) {//basecase 
            return;
        }
        if (j == str.length()) {
            startEndSubString(i + 1, i + 1, str, "");
            return;
        }
        subStr += str.charAt(j);
        if (str.charAt(i) == str.charAt(j)) {
            System.out.println(subStr);
        }
        startEndSubString(i, j + 1, str, subStr);
    }
public static void main(String[] args) {
    String str = "abcabb";
        startEndSubString(0, 0, str, "");
    }
}