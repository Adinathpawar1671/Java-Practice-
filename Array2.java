public class Array2 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[] = {98, 89,99};
        for(int i=0; i<marks.length; i++){
            System.out.println("old Array : "+marks[i]);
        }
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println("new Array : "+marks[i]);
        }
    }
    
}
