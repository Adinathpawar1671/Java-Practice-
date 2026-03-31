public class sortingInsertion {
    public static void Insertion_Sorting(int arr[]){
        
        
        for(int i=1; i<arr.length; i++){
           int curr = i;
           int prev = i-1;

        //finding the correct postion to insert
           while(prev>=0 && arr[prev]>arr[curr]){
        //    System.out.println("previous value :"+prev);
            arr[prev+1] = arr[prev];
            // System.out.println("previous value after assigning prev+1 :"+prev);
            prev--;
            // System.out.println("previous value after prev-- :"+prev);

           }
           //insertion
           arr[prev+1]=arr[curr];
        //    System.out.println("previous value +1:"+prev);
        }
    }
    
    public static void print_Arrr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+"   ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        int arr[]={8,3,9,1,4,2};
        Insertion_Sorting(arr);
        // print_Arrr(arr);
    }   
}
