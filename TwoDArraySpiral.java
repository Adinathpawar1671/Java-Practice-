public class TwoDArraySpiral {
    public static void Spiral_matrix_print(int arr[][]){
        int startrow=0, endrow=arr.length-1, startcol=0, endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol; i<=endcol; i++){
                System.out.print(arr[startrow][i]+" ");
            }
            //right
            for(int j=startrow+1; j<=endrow; j++){
                System.out.print(arr[j][endcol]+" ");
            }
            //bottom
            for(int i=endcol-1; i>=startcol; i--){
                System.out.print(arr[endrow][i]+" ");
            }
            //left
            for(int j=endrow-11; j>=startrow+1; j--){
                System.out.print(arr[j][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String args[]){
        int arr[][]= {{8,9,12,14},
                    {69,18,3,15},
                    {70,19,5,22},
                    {10,23,7,32},
                    {11,21,6,1}};

        Spiral_matrix_print(arr);
    }
}
