public class Array3 {
    public static int linear_Search(String arr[], String key ){

          for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        // int arr[] = {1,5,7,8,4,3,56,10,32,45,54};
        String fruits[]={"mango", "apple", "kiwi", "banana", "pineapple"};
        String find_fruit = "kiwi";
        // int key =11;
        System.out.println(linear_Search(fruits, find_fruit));
      
    }
}
