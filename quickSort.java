public class quickSort {

    public static void quickSortAlgo(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int indexi = partition(arr, si, ei);
        quickSortAlgo(arr, si, indexi - 1);
        quickSortAlgo(arr, indexi+1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

            for(int j=si; j<ei; j++){
                if (arr[j] < pivot) {
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
                    i++;
                    int temp = pivot;
                    arr[ei] = arr[i];
                    arr[i] = temp;
                    return i;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5,-3 };
        quickSortAlgo(arr, 0, arr.length-1);
        printArr(arr);
    }
}
