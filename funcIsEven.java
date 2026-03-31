import java.util.*;
public class funcIsEven {
    public static boolean isEven(int num){
        if(num%2 != 0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if(isEven(a)){
            System.out.println("number is Even");
        }else{
            System.out.println("number is false");
        }

    }
}
