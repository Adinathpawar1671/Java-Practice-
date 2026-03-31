import java.util.*;
public class TwoDArrayq1 {
    public static void Frequency_of_element(int arr[][], int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("frequency : "+count);
    }
    public static void main(String args[]){
        int arr[][]={{19,12,14},
                    {15,18,15},
                    {19,19,15},};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its frequency : ");
        int key  = sc.nextInt();
        Frequency_of_element(arr, key);
    }
}
