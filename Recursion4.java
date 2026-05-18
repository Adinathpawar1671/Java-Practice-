public class Recursion4 {
    public static Boolean checkSortedArr(int arr[], int i){
        if(i== arr.length -1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkSortedArr(arr, i+1);
    }

    public static void main(String args[]){
        int arr[] = {1,2,0,4,5};
       System.out.println(checkSortedArr(arr, 0));
    }
}
    

