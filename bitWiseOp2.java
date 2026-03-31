import java.util.Scanner;

public class bitWiseOp2 {
    public static int updateIthNum(int num, int i, int updateNum){
        int bitMask = 1<<i;
        if(updateNum == 1){
            return num | bitMask;
        }else{
            return num & (~bitMask);
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary Number : ");
        int num = sc.nextInt();
        System.out.println("Enter ith Number you want : ");
        int i = sc.nextInt();
        System.out.println(updateIthNum(10, 2,1 ));
    }
    
}
