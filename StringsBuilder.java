public class StringsBuilder {
    public static void main(String srgs[])
    {
        StringBuilder sb = new StringBuilder("Adinath");
        sb.toString();
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb.length());
    }    
}
