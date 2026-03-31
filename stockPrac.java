public class stockPrac {
    public static void Stock_prices(int arr[]){
        int buy=arr[0];
        int maxprofit=0;
        for(int i=1; i<arr.length; i++){
            if(buy>arr[i]){
                buy = arr[i];
            }
            int profit = arr[i]-buy;
            if(maxprofit<profit){
                maxprofit=profit;
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        int arr[]={2, 2, 2, 7, 2, 9};
        Stock_prices(arr);
    }
    
}
