import java.util.*;
public class funcpalindrome {

    public static boolean palindrome(int num){
        int ogNum = num;
        int rev =0;
        while(num>0){
            int lastDigit = num%10;
            rev = rev * 10 + lastDigit;
            num = (int)num/10;
        }
         if(ogNum == rev){
                return true;
            }else{
                return false;
            }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(palindrome(num)){
            System.out.println("The number "+num+" is palidrome");
        }
        else{
            System.out.println("The number "+num+" is not palidrome");
        }
        
    }
}
