public class Recursion9 {
    public static void duplicateInString(String str,int index, boolean arr[], StringBuilder resStr){   
        if(index==str.length()){
            System.out.println(resStr);
            return;
        }
        int arrindex = str.charAt(index) - 'a';

        if(arr[arrindex]==true){
            duplicateInString(str, index+1, arr, resStr);
        }else{
            resStr.append(str.charAt(index));
            arr[arrindex] = true;
            duplicateInString(str, index+1, arr, resStr);
        }
    }
    public static void main(String args[]){
        String str="aadinatthhh";
        duplicateInString(str,0,new boolean[26], new StringBuilder(""));
    }
}
