import java.util.ArrayList;

public class arrayList2 {
    //Reverse ArrayList, backtracking recursion
    public static void arrayListReverse(ArrayList<Integer> list, int i) {
        if (i == list.size()) {
            return;
        }
        arrayListReverse(list, i + 1);
        System.out.print(list.get(i) + "  ");
    }

    //Finding maximum of ArrayList element
    public static int maximumElArrayList(ArrayList<Integer> list, int i, int max) {
        if (i == list.size()) {
            return max;
        }
        if (max < list.get(i)) {
            max = list.get(i);
        }
        return maximumElArrayList(list, i + 1, max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //size method
        System.out.println("Size of the list : " + list.size());

        //iterable arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "  ");
        }
        System.out.println();

        //printing reverse Array
        arrayListReverse(list, 0);
        System.out.println();


        //maximum of Arraylist
        System.out.println(maximumElArrayList(list, 0, Integer.MIN_VALUE));
    }
}
