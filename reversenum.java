import java.util.*;
public class reversenum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int rev=0;
        int rem;
        while(num>0){
            // int rem = num%10;
            // System.out.print(rem);
            // num/=10;
            rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        num = rev;
        System.out.println("Reverse number is : "+num);
        

    }
}
