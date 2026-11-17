import java.util.ArrayList;
public class arrayList3 {
    public static void swapElOfArrayList(ArrayList<Integer> list, int indx1, int indx2) {
        int num1 = list.get(indx1);
        int num2 = list.get(indx2);
        System.out.println("before Swap index1 and index2 : "+ num1+"   "+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After Swap index1 and index2 : "+ num1+"   "+num2);

    }

public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        swapElOfArrayList(list, 3, 1);

    }
}
