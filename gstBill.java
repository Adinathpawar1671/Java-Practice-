import java.util.*;
public class gstBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float gst = 0.18f;
        float sum = (pen+pencil+eraser)*gst;
        
        double bill = (pen+pencil+eraser)+sum;
        System.out.println("Total GST amount is :");
        System.out.println(bill);
       
    }
}
