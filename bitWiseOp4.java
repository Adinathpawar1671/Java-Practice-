import java.util.Scanner;

    public class bitWiseOp4 {
        public static void swapAandB(int a, int b){
            a = (~0)&b;
            b = (~0)&a;
            System.out.println("a is : "+a);
            System.out.println("b is : "+b);
        }

        public static void addOnetoInteger(int num){
            int bitMask = 1;
            num = bitMask | num;
            System.out.println("the new number is : "+num);
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a : ");
        // int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        // swapAandB(a, b);
        // System.out.println("number : "+(~0));
        addOnetoInteger(b);
    }
    
}
