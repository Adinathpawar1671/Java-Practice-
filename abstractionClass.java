    public class abstractionClass {
    public static void main(String[] args) {
        Horse robert = new Horse();
        robert.walk();
        robert.eat();
        System.out.println(robert.color);

        Chicken ducklike = new Chicken();
        ducklike.eat();
        ducklike.walk();

    }    
}

abstract class Animal{
    String color;
    
    Animal(){
        color = "brown";//now this brown color will also be in Horse class, by default, ie check line number 6
    }

    void eat(){
        System.out.println("Animal eats!");
    }

    abstract void walk();//idea 
}

class Horse extends Animal{
    void setColor(){
        color = "white";
    }

    void walk(){
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }
}