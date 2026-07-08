public class Recursion7 {
    public static int printxRaisetoN(int x, int n){
        if(n==1) return x;
        return x * printxRaisetoN(x, n-1);
    }
    public static int optimisedPow(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimisedPow(x, n/2);
        int halfpowersqr = halfpower * halfpower;
        if(n%2!=0){
            return x * halfpowersqr;
        }
        
    }
    public static void main(String args[]){
        // System.out.println(printxRaisetoN(2, 5));
        System.out.println(optimisedPow(2, 10));
        
    }   
}