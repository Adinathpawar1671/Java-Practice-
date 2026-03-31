public class trappingrainWater {
    public static int trapping_Rain_Water(int arr[]){
        int trappedWater = 0;
        int maxWater =0;

        int leftmax =0;
        int rightmax =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[j]>rightmax){
                    rightmax = arr[j];
                }
            }
            for(int k=i; k>=0; k--){
                if(i==0){
                    leftmax=arr[i];
                    break;
                }
                if(arr[k]>leftmax){
                    leftmax=arr[k];
                }
                
            }
            int min = Math.min(rightmax, leftmax);
            rightmax=0;
            leftmax=0; 
            trappedWater=min-arr[i];
            maxWater+=trappedWater;
            }
           
            return maxWater;
        }
    public static void main(String args[]){
        int arr[]={1,2,6,5};
        int maxwata = trapping_Rain_Water(arr);
        System.out.println(maxwata);
    }
}
