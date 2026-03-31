import java.util.Scanner;

public class pattern7 {
    public static void floyds_triangle(int row, int col)
    {
        int count = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<=i; j++){
                count++;
                System.out.print(count+" ");

            }
            System.out.println();
        }
    }
       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total row : ");
        int totrow = sc.nextInt();

        System.out.println("Enter total column : ");
        int totcol = sc.nextInt();
        System.out.println();
        floyds_triangle(totrow, totcol);
    }
}
