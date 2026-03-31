import java.util.*;
public class Strings1 {
    public static void Print_Letter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        char arr[]={'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");


        //Strings are immutable
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        //length() function in String
        // String fullName = "Tony Stark";
        // System.out.println("length of fullName is : "+fullName.length());

        //String Concatenation
        String firstName = "Adinath";
        String lastName = "Pawar";
        String fullName = firstName+" "+lastName;
        // System.out.println(fullName);

        //String CharAt() function
        // System.out.println(fullName.charAt(0));
        Print_Letter(fullName);
    }
}
