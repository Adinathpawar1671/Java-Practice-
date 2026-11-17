public class backTracking {
    public static int[] decreaseArrayByNum(int i, int arr[]) {
        if (i >= 5) {
            printArray(arr);
            return arr;
        }
        arr[i]=i+1;
        decreaseArrayByNum(i+1, arr);
        arr[i] = arr[i] - 2;
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
            System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        decreaseArrayByNum(0, arr);
        printArray(arr);
    }   
}
