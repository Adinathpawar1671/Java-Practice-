import java.util.Scanner;

public class Recursion2 {
    public static int Factorial(int num){
        int fact;
        if(num==1){
            return 1;
        }
        fact = num*Factorial(num-1);
        // System.out.println(fact);
        return fact;
    }
    public static int sumOfN(int num){
        int sum;
        if(num==1){
            return 1;
        }
        sum = num+sumOfN(num-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ener a number : ");
        int num = sc.nextInt();
        // System.out.println(Factorial(num));
        System.out.println(sumOfN(num));
    }
}
