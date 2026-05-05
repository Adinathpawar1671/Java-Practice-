import java.util.*;
public class pattern9 {
    public static void butterfly_pattern(int row){
        for(int i=1; i<=row; i++){
            for(int j =1; j<=i; j++){
               System.out.print("*");
            }
            for(int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
               System.out.print("*");
            }

            System.out.println(); 
        }
        for(int i=row; i>=1; i--){
           for(int j =1; j<=i; j++){
               System.out.print("*");
            }
            for(int j=1; j<=2*(row-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
               System.out.print("*");
            }

            System.out.println();   
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows you want :");
        int totrow = sc.nextInt();
        butterfly_pattern(totrow);
    }
    
}
