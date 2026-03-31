public class trappingrainWaterop {
    public static void Trapping_Water_Optimize(int arr[]){
        int leftmax[]= new int[arr.length];
        int rightmax[]= new int[arr.length];
        int maxWater=0;
        int trappedWater =0;
        
        //calculating leftmax array for every value of arr[]
        leftmax[0]=arr[0];
        for(int i=1; i<arr.length; i++){
            leftmax[i]= Math.max(arr[i], leftmax[i-1]);
        }

        //calculating rightmax array for every value of arr[]
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            rightmax[i] = Math.max(arr[i], rightmax[i+1]);  
        }
        for(int i=0; i<arr.length; i++){
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterLevel-arr[i];
        }
        System.out.println("max water stored is :"+trappedWater);

    }
    public static void main(String args[]){
        int arr[]={ 4,2,0,6,3,2,5};
        Trapping_Water_Optimize(arr);
    }
}
