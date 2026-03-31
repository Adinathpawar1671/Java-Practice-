import java.util.*;
public class binomialcoe {
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int binomialCoefficient(int n, int r){
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nmr_fact = fact(n-r);
        int result = n_fact/(r_fact*nmr_fact);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();
        System.out.println(binomialCoefficient(n, r));
    }
}
