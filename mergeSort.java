public class mergeSort {
    public static void MergeSortAlgo(int si, int ei, int arr[]) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        MergeSortAlgo(si, mid, arr);
        MergeSortAlgo(mid + 1, ei, arr);
        MergeArray(si,mid, ei, arr);
    }

    public static void MergeArray(int si, int mid, int ei, int arr[]) {
        int j = mid+1;
        int i = si;
        int k=0;
        int temp[] = new int[ei - si + 1];
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copying temp value in original array;
        for ( k = 0, i=si; k <temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8, -2 };
        MergeSortAlgo(0, arr.length - 1, arr);
        printArr(arr);
    }
}
