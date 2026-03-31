import java.util.Arrays;
import java.util.Collections;

public class ArrayInbuiltsort {

     public static void print_Arrr(Integer arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+"   ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        Integer arr[]={9,3,2,8,5,1};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0,3, Collections.reverseOrder());
        print_Arrr(arr);
    }    
}
