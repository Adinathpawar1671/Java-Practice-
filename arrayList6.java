import java.util.ArrayList;

public class arrayList6 {
    public static void trappedWater(ArrayList<Integer> list) {
        int maxwater = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int min_water_height = Math.min(list.get(i), list.get(j));
                int stored_water = (j - i) * min_water_height;
                if (maxwater < stored_water) {
                    maxwater = stored_water;
                }
            }
        }
        System.out.println(maxwater);
    }

    public static void trappedWaterMaxOP(ArrayList<Integer> list) {
        int max_water = 0;
        int i=0;
        int j = list.size()-1;
        while (i < j) {
            int min_bar = Math.min(list.get(i), list.get(j));
            int curr_water = (j - i) * min_bar;
            max_water = Math.max(curr_water, max_water);
            if (list.get(i) < list.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(max_water);
    }

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);     
    list.add(8);     
    list.add(6);     
    list.add(2);     
    list.add(5);     
    list.add(4);     
    list.add(8);     
    list.add(3);     
    list.add(7);
    // trappedWater(list);
    trappedWaterMaxOP(list);
    }
}
