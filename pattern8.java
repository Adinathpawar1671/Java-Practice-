import java.util.Scanner;

public class pattern8 {
        public static void traingle_01(int row){
            for(int i =0; i<row; i++){
                for(int j=0; j<=i; j++){
                    if((i+j)%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        } 
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter total row : ");
        int totrow = sc.nextInt();

        // System.out.println("Enter total column : ");
        // int totcol = sc.nextInt();
        traingle_01(totrow);
    }
}
