public class Array11kadensalgo {
    public static void kadens_Algorithm(int arr[]){
        int sum=0;
        int max_Sum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            max_Sum = Math.max(sum, max_Sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println("max sum "+max_Sum);
    }
    public static void main(String args[]){
        int arr[]={-1,-2,-3,-3,-5,-1};
        kadens_Algorithm(arr);
    }
}
