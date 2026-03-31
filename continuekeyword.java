import java.util.*;
public class continuekeyword {
    public static void main(String args[]){
        // for(int i=0; i<=5; i++)
        // {
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in); 
        int i=1; 
        do{
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if(num%10==0)
            {
                continue;
            }
            System.out.println("you entered : "+num);
        }while(true);
    }
}
