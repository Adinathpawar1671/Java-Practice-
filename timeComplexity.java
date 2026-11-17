public class timeComplexity {
    public static void main(String[] args) {
        int k = 0, n = 3;
        for(int i = 0; i < n; i = i + k) {
            for(int j = 0; j < k; j++) {
                System.out.println(i);
            }
        }
    }
}   