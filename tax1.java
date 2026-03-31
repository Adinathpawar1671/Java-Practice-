import java.util.*;

public class tax1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax;
        if(income<=500000){
            System.out.println("No Tax applicable");
        }
        else if(income>500000 && income<=1000000){
            tax = (float)income*0.2f;
            System.out.println("your tax amount on"+ income +"will be : "+ tax+ " i.e is 20%");
        }
        else{
            tax = (float)0.3f*income;
            System.out.println("your tax amount on"+ income +"will be : "+ tax +"i.e is 30%");
        }
    }
    
}
