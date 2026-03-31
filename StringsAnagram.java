import java.util.Arrays;

public class StringsAnagram {
    public static void main(String args[]){
        String str="three";
        String str2="theree";
        if(str.length()==str2.length()){
            
            char arr1[] = str.toCharArray();
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2)){
                System.out.println("they are Anagrams");
            }else{
                System.out.println("They are not anagrams");
            }

        }else{
                System.out.println("They are not anagrams");

        }

    }
    
}
