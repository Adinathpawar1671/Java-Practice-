import java.util.ArrayList;

public class arrayList7 {
    public static void pairSumBruteForce(ArrayList<Integer> list) {
        //[1,2,3,4,5,6]
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 5) {
                    System.out.println("Numbers are : " + list.get(i) + "&" + list.get(j));
                }
            }
        }
    }

    public static boolean pairSumOp(ArrayList<Integer> list, int target){
        int i = 0; 
        int j = list.size()-1;
        while (i < list.size() - 1 && j >= 1) {
            int sum = list.get(i) + list.get(j);
            if (sum == target) {
                System.out.println("target exists at : " + i + "and " + j);
                return true;
            }
            if (sum > target) {
                j--;
            }
            if (sum < target) {
                i++;
            }
        }
        System.out.println("Doesnt exist!");
        return false;
    }
 

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6); 
        // pairSumBruteForce(list);
        pairSumOp(list, 5);
    }
}
