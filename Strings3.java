public class Strings3 {
    public static void Count_vowels(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='o'|| ch =='i' || ch =='e' || ch =='u'){
                count++;
            }
        }
        System.out.println("number of vowels in the sentence is : "+count);
    }
    public static void main(String srgs[]){
        // Count_vowels("my name is adinath, whats your name?");

        String str1 ="adinath";
        String str2 ="priyanka";
        String str3 ="adinath";
        System.out.println(str1.equals(str2)+" "+str1.equals(str3));
    }
    
}
