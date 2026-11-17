import java.util.ArrayList;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list1.add(1);//adding el in list , O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1);

        //get method
        int el = list1.get(2);
        System.out.println(el);

        //remove method
        list1.remove(3);
        System.out.println(list1);
    
        //set method
        list1.set(3, 10);
        System.out.println(list1);
        
        //contain method
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(5));

        //size Method
        System.out.println(list1.size());
    }

}
