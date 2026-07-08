public class Recursion14 {
    public static int lengthOfString(String str, int i, int count) {
        if (str.equals("")) {
            return count;
        }
        return lengthOfString(str, i+1, count+1);
    }

    public static void main(String[] args) {
        System.out.println(lengthOfString("abcd", 0, 0));
    }
    
}
