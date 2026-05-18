import java.util.Scanner;

public class Recursion3 {
    public static int  Fibonacci(int num){
        int fib;
        if(num==1){
            return 1;
        }
        else if(num==0){
            return 0;
        }
        fib = Fibonacci(num-2)+Fibonacci(num-1);
        return fib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anumber : ");
        int a = sc.nextInt();
        System.out.println(Fibonacci(a));

    }
    
}
