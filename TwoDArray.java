import java.util.*;

public class TwoDArray {
    public static void find_large_small_2Darr(int arr[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]>largest){
                    largest = arr[i][j];
                }
                if(arr[i][j]<smallest){
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println("largest number is 2d array is "+ largest);
        System.out.println("smallest number is 2d array is "+ smallest);
    }
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        Scanner sc = new  Scanner(System.in);
        //Accepts the values in the array!
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        //Prints the value n the array!
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        find_large_small_2Darr(arr);

    }
}
