public class StringsSubs {
    public static void Sub_String(String str, int startindx, int endindx){
        String res="";
        for(int i=startindx; i<endindx; i++ ){
            res+=str.charAt(i);
        }
        System.out.println(res);
    }
    public static void main(String args[]){
        String str = "Adinath";
        int startindx=5;
        int endindx=6;
        System.out.println(str.substring(0,2));
        Sub_String(str, startindx, endindx);
    }
    
}
