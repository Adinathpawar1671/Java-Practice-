import java.util.*;

public class funcavgOf3 {
    public static float avgOf3Num(int a, int b, int c){
        float avg = (float)(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = avgOf3Num(a, b, c);
        System.out.println(avg);

    }
}
