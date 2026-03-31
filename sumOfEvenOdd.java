import java.util.*;
     public class sumOfEvenOdd{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose a option :  1.Program\t2.Exit");
            int option = sc.nextInt();
            int evensum=0;
            int oddsum = 0;
            switch(option){
                case 1 : 
                System.out.println("Enter the how many numbers you want to input : ");
                int n =sc.nextInt();
                for(int i=1; i<=n; i++){
                    System.out.println("Enter a number :");
                    int num = sc.nextInt();
                    if(num%2==0){
                        evensum += num;
                    }
                    else{
                        oddsum +=num;
                    }
                }  
                System.out.println("sum of all even number is : "+evensum);
                System.out.println("sum of all odd number is : "+oddsum);
                break;

                case 2 :    break;
            }
        }
     }