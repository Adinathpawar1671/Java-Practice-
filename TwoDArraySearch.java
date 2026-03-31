import java.util.*;
public class TwoDArraySearch {
    public static boolean Search_inSorted_Matrix(int arr[][], int key){
       
       //Brute Force
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(arr[i][j]==key){
        //             System.out.println("the key is present at : "+i+ ","+ j+ "(indexes)");
        //         }
        //     }
        // }

        //optimise
        int row = 0;
        int col = arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("Found key at"+row+","+col);
                return true;
            }
            else if(arr[row][col]>key){
                col--;
            }
            else{
                if(arr[row][col]<key){
                    row++;
                }
            }
        }
        System.out.println("no key found");
        return false;




        // int start=arr.length-1;
        // int end=0;
        // while(start>=0 && end<arr[0].length){
        //     if(arr[start][end]==key){
        //         System.out.println("present");
        //     }
        //     if(arr[start][end]>key){
        //         start--;
        //     }
        //     if(arr[start][end]<key){
        //         end++;
        //     }
        // }

    }
    public static void main(String args[]){
        int arr[][]={{1, 4, 7, 11},
                    {2, 5, 8, 12},
                    {3, 6, 9, 16},
                    {10, 13, 14, 17}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Key to be Searched : ");
        int key = sc.nextInt();
        Search_inSorted_Matrix(arr, key);

    }
}
