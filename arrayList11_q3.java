import java.util.ArrayList;
import java.util.Collections;

public class arrayList11_q3 {
    public static void keyFinder(ArrayList<Integer> list1,ArrayList<Integer> list2, int key, int i, ) {
        if (list.get(i) == key) {
            frequentNumFollowingKey(list1, list2, i+1, key, 0);
            return;
        }
        keyFinder(list1, key, i+1);
    }

    public static void frequentNumFollowingKey(ArrayList<Integer> list1, ArrayList<Integer> list2, int keyindx,int key, int max) {
        if (keyindx > list1.size()) {
            return;
        }
        if (list1.get(keyindx) != key) {
            list2.set(list1.get(keyindx), list2.get(list1.get(keyindx)) + 1);
        }
        frequentNumFollowingKey(list1, list2, keyindx + 1, key, max);
        if (max < list2.get(keyindx)) {
            max = keyindx;
            return list2.get(keyindx);
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(100);
        list1.add(200);
        list1.add(1);
        list1.add(100);
        int max = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) > max) {
                max = list1.get(i);
            }
        }
        ArrayList<Integer> list2 = new Arraylist<>(Collections.nCopies(max + 1, 0));
        

    }
}
