public class methodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();  
        System.out.println(cal.sum(23, 78));
        System.out.println(cal.sum(23.5f, 78.7f));
        System.out.println(cal.sum(23, 78, 90));

    }
}

class Calculator{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public float sum(float a, float b){
        return a+b;
    }
    // public int sum(int a, int b){
    //     return a+b;
    // }  🚫🙅 this wont work cause --> method sum(int,int) is already defined in class Calculator
   
}
