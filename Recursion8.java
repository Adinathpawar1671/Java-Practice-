public class Recursion8 {
    public static int tileProblem(int n)// 2 x n(floor size), 2 x 1(tile) 
    {
        if(n==1 || n==0){  
            return 1;
        }
        int vertical = tileProblem(n-1);
        int horizontal  = tileProblem(n-2);
        System.out.print("vertical : "+ n +" " + vertical+"  ");
        System.out.println();
        System.out.print("horizontal : "+ n +" " + horizontal+"    ");
        int totaltileMethod = vertical + horizontal;

        return totaltileMethod;
    }
    public static void main(String[] args) {
      tileProblem(4);
    }
}
