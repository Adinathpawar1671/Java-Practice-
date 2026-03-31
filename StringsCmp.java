public class StringsCmp {
    public static void main(String args[]){
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        if(s1==s2){
            System.out.println("s1 is equal to s2");
        }else{
            System.out.println("s1 and s2 arent equal");
        }
        if(s1.equals(s3)){
            System.out.println("s1 and s3 equal");
        }else{
            System.out.println("s1 and s3 not equal");
        }
    }

}