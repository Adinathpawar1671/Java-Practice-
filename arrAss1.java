public class arrAss1 {
    public static boolean duplicate_element_Arr(int arr[]){
        boolean value = false;
        for(int i=0;i<arr.length; i++){
            value=false;
            for(int j=i+1;j<arr.length; j++){
                if(arr[i]== arr[j]){
                    value = true;
                    break;
                }
            }
            System.out.println(arr[i]+": "+value);
        }
        return value;
    }
    public static void main(String args[]){
        int arr[]={1, 1, 2, 8, 9, 8, 4, 1};
        duplicate_element_Arr(arr);   

    }
}
    