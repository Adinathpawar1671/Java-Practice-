public class Recursion12 {
    public static String findOccurenceOfKey(int i, int key, int arr[], String str) {
        //base case
        if (i == arr.length) {
            System.out.println(str);
            return str;
        }
        if (arr[i] == key) {
            str+=i;
        }
        return findOccurenceOfKey(i + 1, key, arr, str);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        findOccurenceOfKey(0, 2, arr, "");
    }

}
