import java.util.*;
public class countingSort {
    public static int[] counting_Sort(int arr[]){
        
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int auxArr[] = new int [largest];

        for(int i=0; i<largest; i++){

            auxArr[arr[i]]++;
            // int indx = arr[i];
            // auxArr[indx] = auxArr[indx]+1;
        }

        int j=0;
        for(int i=0; i<auxArr.length; i++){
            while(auxArr[i]>0){
                arr[j]=i;
                j++;
                auxArr[i]--;
            }
        }
        return arr;

    }


    public static void print_Arrr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+"   ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        int arr[]={ 1,4,1,3,2,4,3,7};
        counting_Sort(arr);
        print_Arrr(arr);

    }
}
