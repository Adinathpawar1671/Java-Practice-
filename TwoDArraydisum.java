public class TwoDArraydisum {
    public static void diagonal_Sum_Of_Array(int arr[][]){
        int sum =0;

        if(arr.length == arr[0].length){
            for(int i=0; i<arr.length; i++){
            sum+=arr[i][i];

            if(arr.length-1-i!=i){
            sum+=arr[i][arr.length-1-i];
            }    
        }
        System.out.println(sum);
    }else{
        System.out.println("Array is not a square matrix!");
    }
    }
    public static void main(String args[]){
        int arr[][] = {{9,12,14},
                    {69,18,15},
                    {70,19,5},};
        diagonal_Sum_Of_Array(arr);
    }   
}
