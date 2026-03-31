import java.util.*;
public class Array1 {
    public static void main(String args[]){

        //1. Creating Array;
        // int marks[]= new int[50];
        // int numbers[]={1,2,3};
        // String fruits[] = {"mango", "apple", "kiwi" };

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();//math
        marks[1] = sc.nextInt();//computer Science
        marks[2] = sc.nextInt();//Physics
        System.out.println("Math : "+marks[0]+" cs : "+marks[1]+" Physics : "+marks[2]);
        // marks[1] =100;
        // OR 
        marks[1] = marks[1]+1;
        System.out.println("cs : "+marks[1]);

        int percentage = ((marks[0]+marks[1]+marks[2])/3);
        System.out.println("percentage : "+ percentage+"%");

        System.out.println("Array length of name marks is : "+marks.length);

    }
    
}
