public class backtrackingSubset {
    public static void stringSubset(int i, String str, String ans) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");    
            } else {
                System.out.println(ans);
            }
            return;
        }
        stringSubset(i + 1, str, ans);
        stringSubset(i + 1, str, ans+str.charAt(i));

    }

    public static void main(String[] args) {
        String ans = new String();
        String str = "abc";
        stringSubset(0, str, ans);
    }
    
}
