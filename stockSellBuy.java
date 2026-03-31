public class stockSellBuy {
    public static void Sell_And_Buy_stock(int arr[]){
        int profit = 0, maxprofit=0;
        for(int i=0; i<arr.length; i++){
            int invest=arr[i];
            System.out.println("buying stock on day : "+i);
            for(int j=i+1; j<arr.length; j++){
                profit = arr[j]-invest;
                if(maxprofit<profit){
                    maxprofit=profit;
                    System.out.println("selling on day "+j+":"+maxprofit);
                }
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String args[]){
        int arr[]={2, 4, 10, 7, 0 , 9};
        Sell_And_Buy_stock(arr);
    }
}
