//Clear last ith bit 
import java.util.*;

public class bitWiseOp3 {
    public static int clearLastIthBit(int num, int i){
        int bitMask = (~0)<<i+1;
        return num & bitMask;
    }

    public static int clearLastIthBitsInRange(int num, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a | b;
        return num & bitMask;
    }

    public static boolean twoPowerNumb(int num){
        return (num & (num-1))== 0? true : false; 
    }

    public static int countSetBitsInNum(int num){
        int count=0;
        while(num>0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Enter Last ith Range to be consider");
        int i = sc.nextInt();
        System.out.println("result : "+clearLastIthBit(num, i));
        System.out.println("result : "+clearLastIthBitsInRange(10, 2, 4));
        System.out.println(twoPowerNumb(num));
        System.out.println(countSetBitsInNum(num));

    }
}
