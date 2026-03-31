public class TwoDArrayq3 {
    public static int[][] Transpose_Matrix(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;

        int resarr[][]=new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                resarr[j][i] = arr[i][j];
            }
        }
        return resarr;
    }
    public static void Print_Array(int arr[][]){
        for(int i=0; i<arr.length; i++ ){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int arr[][] ={{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        Print_Array(Transpose_Matrix(arr));

        
    }
    
}
