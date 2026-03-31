import java.util.*;
public class func2 {
    public static int multiply(int num1,int num2){//parameters/formal parameters
    
        int product = num1*num2;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a, b);//actual parameters or arguments; call by value
        System.out.println("the product of a and b is : "+product);

    }
}
