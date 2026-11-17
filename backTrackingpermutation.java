public class backTrackingpermutation {
    public static void stringPermuatation(String str, String ans) {
        //base case;
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recurrsion
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            stringPermuatation(newStr, ans+currChar);
        }
    }

    public static void main(String[] args) {
        stringPermuatation("abc", "");
    } 
}
