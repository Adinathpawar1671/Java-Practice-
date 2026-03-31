import java.util.*;
public class funcprime {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void rangePrime(int n){
        for(int i=2; i<=n; i++){
            if(prime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its prime or not : ");
        int n = sc.nextInt();
        // System.out.println(prime(n));
        rangePrime(n);
    }
}

