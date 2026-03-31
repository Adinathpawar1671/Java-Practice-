public class stockSellBuyop {
    public static void Stock_Sell_Buy_op(int arr[]){
        int profit=0;
        int maxprofit=0;
        int buy = arr[0];
        for(int i=1; i<arr.length; i++){
            if(buy>arr[i]){
                buy=arr[i];
            }
            profit= arr[i]-buy;
            if(maxprofit<profit){
                maxprofit=profit;
            }
        }
        System.out.println("maxprofit : "+maxprofit);
    }
    public static void main(String args[]){
        int arr[]={2, 4, 10, 7, 1 , 9};
        Stock_Sell_Buy_op(arr);
    }
    
}
