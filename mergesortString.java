public class mergesortString {
    public static void mergeSortStringQue(String str[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        mergeSortStringQue(str, si, mid);
        mergeSortStringQue(str, mid + 1, ei);
        mergeString(str, si, mid, ei);
    }

    public static void mergeString(String str[], int si, int mid, int ei) {
        String temp[] = new String[(ei-si)+1];
        int i = si;
        int j = mid + 1;
        int k = 0;  
        while (i <= mid && j <= ei) {
            if ((str[i].charAt(0) - 'a') <= (str[j].charAt(0) - 'a')) {
                temp[k] = str[i];
                i++;
            } else if ((str[i].charAt(0) - 'a') > (str[j].charAt(0) - 'a')) {
                temp[k] = str[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k++] = str[i++];
        }
        while (j <= ei) {
            temp[k++] = str[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            str[i] = temp[k];
        }
    }

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }
    public static void main(String[] args) {
        String str[] = { "sun", "earth", "mars", "mercury" };
        mergeSortStringQue(str, 0, str.length - 1);
        printArr(str);
    }
}
