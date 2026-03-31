public class Array5Binary_Search {
    public static int binary_Search(int arr[], int key){
        int start =0, end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){//key will be found on mid 
                return mid;

            }else if(arr[mid]>key){//left
                end = mid-1;

            }else if(arr[mid]<key){//right
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14};
        int key = 12;
        System.out.println(binary_Search(arr, key));
    }    
}
