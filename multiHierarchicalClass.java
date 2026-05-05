public class multiHierarchicalClass {
    public static void main(String[] args) {
        Car ragnaRock = new Car();
        ragnaRock.horsePower();
        ragnaRock.sedan();
        ragnaRock.offRoad();

    }
}

interface Honda{
    void sedan();
    void horsePower();
}

interface Mistubushi{
    void offRoad();
}

//apply both peoperties in single class.

class Car implements Honda, Mistubushi{
    public void sedan(){
        System.out.println("it as an sedan");
    }

    public void offRoad(){
        System.out.println("it is an Offroad vehical too");
    }

    public void horsePower(){
        System.out.println("Big on power");
    }
}