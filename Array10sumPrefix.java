public class Array10sumPrefix {
    public static void sum_of_subArray_prefix(int arr[]){
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixarr[] = new int [arr.length];

        prefixarr[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            prefixarr[i]=prefixarr[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start =i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                currentsum = start==0? prefixarr[end]:prefixarr[end]-prefixarr[start-1];
                if(currentsum>maxSum){
                    maxSum=currentsum;
                }
            }
        }
        System.out.println("max sum : "+maxSum);
    }
    public static void main(String args[]){
        int arr[]={1, -2, 6, -1, 3};
        sum_of_subArray_prefix(arr);
    }
}
