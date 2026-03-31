public class Array7Pairs {
    public static void pair_Elements_Array(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,5,6,7};
        pair_Elements_Array(arr);

    }
    
}
