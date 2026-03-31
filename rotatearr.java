public class rotatearr {
    public static int rotate_Array_search(int arr[],int target){
        int start=0; int end = arr.length-1;
       while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(arr[mid]>target && arr[start]<=target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]<=target && arr[end]>=target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
       }
       return -1;
        
    }
    public static void main(String args[]){
        int arr[]={3,4,5,6,7,0};
        int index=rotate_Array_search(arr, 4);
        System.out.println(index);
    }
    
}
