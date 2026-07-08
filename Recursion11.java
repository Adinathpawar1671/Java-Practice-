public class Recursion11 {
    public static void binaryString(int prev,int n, String str){
       
        if(n==0){
            System.out.println(str);
            return;
        }
        if(prev == 0){
            binaryString(1, n-1, str+"1");
        }
        binaryString(0, n-1, str+"0");

    }    
public  static void main(String[] args){
       binaryString(0, 4, "");
    }
    
}
