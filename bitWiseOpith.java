import java.util.*;

public class bitWiseOpith {
    public static int  getIthBit(int num, int i){
        int bitmask  = 1<<i; 
        if((num & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }

    public static int clearIthBit(int num, int i){
        int bitMask = ~(1<<i);
        return num & bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary Number : ");
        int num = sc.nextInt();
        System.out.println("Enter ith Number you want : ");
        int i = sc.nextInt();
        // System.out.println(getIthBit(num, i));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(num, i));
    }
}
