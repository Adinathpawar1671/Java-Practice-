public class sortingBubbleRev {
    public static void Bubble_Sort_Reverse(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
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
        Bubble_Sort_Reverse(arr);
        print_Arrr(arr);
    }

}
