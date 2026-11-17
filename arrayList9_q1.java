import java.util.ArrayList;

public class arrayList9_q1 {
    public static void monotonicArrayList(ArrayList<Integer> list) {
        int countIncreasing = 0;
        int countDecreasing = 0;

        for (int i = 0, j = 1; i < list.size() - 1; i++, j++) {
            if (list.get(i) < list.get(j)) {
                countIncreasing++;          
                // System.out.println(count);
            }else if(list.get(i) > list.get(j)){
                countDecreasing++;
                // System.out.println(count);
            }
        }
        if (countDecreasing == 0) {
            System.out.println("its increasing Monotonic");
        } else if (countIncreasing == 0) {
            System.out.println("its decreasing Monotonic");
        } else {
            System.out.println("not monotnoic");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //increasing 
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(15);

        //decreasing
        // list.add(10);
        // list.add(8);
        // list.add(5);
        // list.add(3);
        // list.add(1);
        monotonicArrayList(list);

    }
}
