import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayList10_q2 {
    public static void lonelyNumInArrayList(ArrayList<Integer> list1, ArrayList<Integer> list2, int i) {
        if (i == list1.size()) {
            return;
        }
        int currvalue = list2.get(list1.get(i));//calculating existing value of list2 index list1(i)

        list2.set(list1.get(i), currvalue + 1);
        lonelyNumInArrayList(list1, list2, i + 1);
        if (i == list1.size() - 1) {
            if (list2.get(list1.get(i)) == 1 && list2.get(list1.get(i)-1) == 0) {
                System.out.println(list1.get(i));
                return;
            }
        } else if (i == 0) {
            if (list2.get(list1.get(i)) == 1 && list2.get(list1.get(i)+1) == 0) {
                System.out.println(list1.get(i));
                return;
            }
        } else {
            if (list2.get(list1.get(i)) == 1 && list2.get(list1.get(i)+1) == 0 && list2.get(list1.get(i)-1) == 0) {
                System.out.println(list1.get(i));
                return;
            }
        }
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(1);
        // list1.add(3);
        // list1.add(5);
        // list1.add(3);
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(
            10, 1, 3, 10, 5, 2, 100, 12, 7, 15, 6
        ));
        Collections.sort(list1);

        int maxVal = list1.get(list1.size() - 1);
        ArrayList<Integer> list2 = new ArrayList<>(Collections.nCopies(maxVal + 1, 0)); 
        
        lonelyNumInArrayList(list1, list2, 0);
    }   
}
