public class Array8Subarray {
    public static void Sub_Array(int arr[]){
        for(int i=0; i < arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }System.out.println();
            }System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,20,4,10,11,23,45};
        Sub_Array(arr);
    }
}
