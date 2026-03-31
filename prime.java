import java.util.*;
public class prime {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number : ");
    long n = sc.nextLong();
    int count =0;
    for(int i=1; i<=n; i++){
        if(n%i==0){
            count++;
        }
    }
    if(count<3){
        System.out.println("number is prime");
    }else{
        System.out.println("Not Prime");
    }
 }   
}
