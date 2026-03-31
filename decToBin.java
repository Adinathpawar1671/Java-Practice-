import java.util.*;
// import java.math.*;
public class decToBin {
    public static int decToBinary(int num){
        int rem = 0;
        int pow = 0;
        int binaryNum = 0;
        while(num>0){
            rem = num%2;
            binaryNum = binaryNum + rem * (int)Math.pow(10,pow);
            num = num/2;
            pow++;
        }
            return binaryNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int final_ans = decToBinary(num);
        System.out.println(final_ans);   
    }
    
}
