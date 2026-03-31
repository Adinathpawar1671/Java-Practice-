public class Array9sumOfsubarr {

    public static void sum_Of_SubArray(int arr[]){
        int current_Sum=0;
        int final_sum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                
                current_Sum=0;  
                for(int k=i; k<=j; k++){
                    current_Sum=current_Sum+arr[k];
                }
                System.out.println(current_Sum);
                if(current_Sum>final_sum){
                        final_sum=current_Sum;
                }
            }
        }
        System.out.println("maximum sume : "+final_sum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        sum_Of_SubArray(arr);
    }
}
