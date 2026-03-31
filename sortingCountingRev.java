public class sortingCountingRev {
    public static void counting_Sort_Rev(int arr[]){
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }    
        int count[] = new int[largest+1];
        for(int j=0; j<arr.length; j++){
            count[arr[j]]++;
        }
        //insertion
        int j=0;
        for(int k=count.length-1; k>0; k--){
            while(count[k]>0){
                arr[j]=k;
                j++;
                count[k]--;
            }
        }
    }
    
    public static void print_Arrr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        counting_Sort_Rev(arr);
        print_Arrr(arr);
    }
}
