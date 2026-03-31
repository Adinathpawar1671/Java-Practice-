public class Array4Largestnum {
    public static int Largest_num_Array(int arr[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest value is : "+smallest);
    return largest;
    }
    public static void main(String args[]){
        int arr[]={1,3,67,5,7};
        int largest_num = Largest_num_Array(arr);
        System.out.println("Largest number form Array is : "+largest_num);
    }   
}
