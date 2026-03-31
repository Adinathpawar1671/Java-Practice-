import java.util.*;
public class whileloops {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.println("Enter how many times you want to print hello world :  ");
        int num = sc.nextInt();
        
        while(i<num){
            System.out.println("Hello World");
            i++;
        }
    }

}
