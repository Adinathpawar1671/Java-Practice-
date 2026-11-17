public class searchrotatedarray {
    public static void searchRoatedArray(int arr[], int si, int ei, int target) {
        int mid = si + (ei-si)/2; 
        // System.out.println(mid);
        if (si >= ei) {
            return ;
        }
        if (arr[mid] == target ) {
            System.out.println(mid);
        }
        if (target <= arr[mid] && target >= arr[si]) { 
            searchRoatedArray(arr, si, mid, target); 
        }
        else if(target<=arr[mid] && target <= arr[ei]) {
            searchRoatedArray(arr, mid+1, ei, target);
        }
    }

public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    searchRoatedArray(arr, 0, arr.length - 1, 0);
    }
}
