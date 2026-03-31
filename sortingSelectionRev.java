public class sortingSelectionRev {
    public static void Selection_Sort_Rev(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int leastindx=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[leastindx]<arr[j]){
                    leastindx=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]=arr[leastindx];
            arr[leastindx]=temp;
           
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
        Selection_Sort_Rev(arr);
        print_Arrr(arr);

    }
}
