import java.util.*;

public class Recursion1 {
    public static void nTo1Func(int n){
    // if(n==1){
    //     System.out.println(1);
    //     return;
    // }
        if(n>0){
        System.out.println(n);
        nTo1Func(n-1);
    }
}

    public static void printIncrease(int n){
        if(n==1){
            System.out.println("1");
            return;
        }
       printIncrease(n-1);
        System.out.println(n);         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        // nTo1Func(num);
        printIncrease(num);
    }
    
}
