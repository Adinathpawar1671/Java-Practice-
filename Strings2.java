public class Strings2 {
    public static boolean palindrome_String(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str = "racecar";
        if(palindrome_String(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}
