import java.util.*;
public class breakkey {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        for(int i=1; i<=100; i++){
            int num = sc.nextInt();
            if(num%10==0){
                break;
            }
            else{
                System.out.println("Entered num is : "+num);
            }
        }System.out.println("exited");
    } 
}
