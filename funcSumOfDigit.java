import java.util.*;
public class funcSumOfDigit {
    public static int SumOfDigit(int num){
        int sum = 0;
        while(num>0){
            int lastDigit = num%10;
            sum = sum+lastDigit;
            num = num/10;
        }
        return sum;
}
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anumber : ");
        int num = sc.nextInt();
        int ans = SumOfDigit(num);
        System.out.println("the sum of All Digits is : "+ans);
    }
    
}
