import java.util.ArrayList;

public class arrayList8 {
    public static boolean rotatedArrayPairSum(ArrayList<Integer> list, int target) {
        int i = 0;
        int j = 0;
        
        //finding breaking point!
        for (int k = 0; k < list.size()-1; k++) {
            if (list.get(k) > list.get(k + 1)) {
                i = k + 1;
                j = k;
            }
        }

        // [11,15,6,8,9,10]
        //Working!
        while (i != j) {
            int sum = list.get(i) + list.get(j);
            if (sum == target) {
                System.out.println(i+"and"+j);
                return true;
            }
            if (sum > target) {
                j--;
                if (j == -1) {
                    j = list.size() - 1;
                }
            } else if (sum < target) {
                i++;
                if (i == list.size()) {
                    i = 0;
                }
            }
        }
        System.out.println("Doesnt exist!");
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        rotatedArrayPairSum(list, 26); 
    }
    
}
