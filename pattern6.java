import java.util.*;
public class pattern6 {
    public static void inverted_triangle(int totrow, int totcol){
        for(int i =0; i<totrow; i++){
            for(int j = 0; j<totcol-i; j++ ){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
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
        
        inverted_triangle(totrow, totcol);
    }
}
