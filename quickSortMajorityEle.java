public class quickSortMajorityEle {
    public static void majorityElement(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int indexi = parition(arr, si, ei);
        majorityElement(arr, si, indexi - 1);
        majorityElement(arr, indexi +1, ei);

    }

    public static int parition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;
        int j = si;
        while (j <= ei) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }

    public static void repetiveElements(int arr[], int i, int max, int majnum) {
        int num = arr[i];
        int count = 0;hx
        int j = i;
        while (num != arr[j]) {
            count++;
            j++;
        }
        if (max < count) {
            max = count;
            repetiveElements(arr, i, max, num);
        }
        repetiveElements(arr, j, max, num);

    }
    public static void main(String[] args) {
        int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
        majorityElement(arr, 0, arr.length-1);
        // printArr(arr);
        repetiveElements(arr, 0, 0, 0);

    }

}
