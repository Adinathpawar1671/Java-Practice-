import java.util.Scanner;

public class TwoDArrayq2 {
    public static void Print_sum_2Array(int arr[][], int row){
        int sum=0;
            for(int j=0; j<arr[0].length; j++){
                sum+=arr[row][j];
            }
        System.out.println("The sum of "+row+" is : "+sum);
    }
    public static void main(String args[]){
        int arr[][]={{19,12,14},
                    {15,18,15},
                    {19,19,15},};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row to find its sum : ");
        int key  = sc.nextInt();
        Print_sum_2Array(arr, key);
    }
    
}
