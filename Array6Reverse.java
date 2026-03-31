public class Array6Reverse {
    public static int[] reverse_Array(int arr[]){
        int first = 0, last = arr.length-1;
        while(first<last){ 
            int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
        }
        return arr;
        
    }
    public static void main(String args[]){
        int arr[]={2,3,5,7,10,12};
        reverse_Array(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
