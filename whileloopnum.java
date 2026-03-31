import java.util.*;
public class whileloopnum {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        int num = sc.nextInt();
        int counter =1;
        while(counter<=num){
            System.out.println(counter);
            counter++;
        }
    }    
}
