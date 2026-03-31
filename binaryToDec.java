import java.util.*;
public class binaryToDec {
    public static int binaryToDecimal(int n){
        
        int num1 = 0;
        int val =0;
        int i=1;
        while(n>0){
            num1 = n%10;
            val = val +num1*i;
            n = n/10;
            i=i+i;
        }     
            return val;
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dec = binaryToDecimal(n);
        System.out.println(dec);

    }
    
}
