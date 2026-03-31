public class duplicate {
    public static void Fidn_Duplicates(int arr[]){
        int count[] = new int[100]; 

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            count[val]++; // Increment the count at that index

            if (count[val] == 2) { // The second time we see it
                System.out.println("Duplicate found: " + val);
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,1,2,3,3,2,4,5};
        Fidn_Duplicates(arr);
    }
}
