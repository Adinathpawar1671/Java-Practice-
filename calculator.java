import java.util.*;
public class calculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter 1st number : ");
        int num2 = sc.nextInt();
        
        System.out.println("Choose operation to perform");
        int cal = sc.next().charAt(0);
        switch(cal){
            case '+' : System.out.println((num1+num2));
                       break;
            
            case '-' : System.out.println((num1-num2));
                       break;

            case '%' : System.out.println((num1%num2));
                       break;
            
            case '/' : System.out.println((float)(num1/num2));
                       break;
                       
            case '*' : System.out.println((num1*num2));
                       break;
                    
            default : System.out.println("not good");
        }
    }
}
