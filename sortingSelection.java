public class sortingSelection {
    public static void Selection_Sort(int arr[]){

        for(int i=0; i<arr.length-1; i++){//arr.length-1 because last element will be the very biggest so we dont need to find any smaller elements in the array
            int minindex =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minindex]>arr[j]){
                    minindex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
    }
}
    public static void print_Arrr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+"   ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1, 6};
        Selection_Sort(arr);
        print_Arrr(arr);
    }
}
